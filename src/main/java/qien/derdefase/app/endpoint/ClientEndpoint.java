package qien.derdefase.app.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qien.derdefase.app.model.order.Quotation;
import qien.derdefase.app.model.order.QuotationRequest;
import qien.derdefase.app.service.orderservice.QuotationRequestService;
import qien.derdefase.app.service.orderservice.QuotationService;

@RestController
@RequestMapping("/client")
public class ClientEndpoint {

    @Autowired
    QuotationRequestService quotationRequestService;

    @Autowired
    QuotationService quotationService;

    //aanmaken quotation request

    @PostMapping("/newquotation")
    public QuotationRequest newRequest(@RequestBody QuotationRequest quotationRequest) {
        System.out.println("client endpoint");
        System.out.println("shipping method" + quotationRequest.getShippingMethod());
        return quotationRequestService.newQuotationRequest(quotationRequest);
    }

    //accepteren quotation
    @PutMapping("/acceptQuotation/{id}")
    public Quotation acceptQuotationById(@PathVariable(value = "id") long id) {
        return quotationService.acceptQuotation(id);
    }

    //weigeren quotation
    @PutMapping("/notacceptQuotation/{id}")
    public Quotation notAcceptQuotationById(@PathVariable(value = "id") long id) {
        return quotationService.notAcceptQuotation(id);
    }

}
