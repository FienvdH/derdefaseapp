package qien.derdefase.app.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import qien.derdefase.app.model.order.Price;
import qien.derdefase.app.model.order.Quotation;
import qien.derdefase.app.model.order.QuotationRequest;
import qien.derdefase.app.service.orderservice.PriceService;
import qien.derdefase.app.service.orderservice.QuotationRequestService;
import qien.derdefase.app.service.orderservice.QuotationService;

@RestController
@RequestMapping("/sales")
public class SalesEndpoint {

    @Autowired
    QuotationRequestService quotationRequestService;

    @Autowired
    QuotationService quotationService;

    @Autowired
    PriceService priceService;

    @GetMapping("/allrequests")
    public Iterable<QuotationRequest> getAllQuotationRequests() {
        return quotationRequestService.getAllQuotationRequests();
    }

    @GetMapping("/getrequest/{id}")
    public QuotationRequest getQuotationRequestById(@PathVariable(value = "id") long id){
         return quotationRequestService.getById(id);
        }

    //maakt een Price aan, moet eerst gebeuren voor van de request een quotation gemaakt kan worden

    @GetMapping("/requesttoprice/{id}")
    public Price calculatePrice(@PathVariable(value = "id") long id){
        return priceService.getPrice(quotationRequestService.getById(id));

    }

    // requestquotation and price id invoeren en daar quotation van maken ?
    @GetMapping("/requesttoquotation/{quotationRequestId}/{priceId}")
    public Quotation makeQuotation(@PathVariable(value = "quotationRequestId") long quotationRequestId, @PathVariable(value = "priceId") long priceId){
        return quotationService.newQuotation(new Quotation(quotationRequestService.getById(quotationRequestId), priceService.getById(priceId)));

    }
}






