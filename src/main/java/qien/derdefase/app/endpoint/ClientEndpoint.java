package qien.derdefase.app.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qien.derdefase.app.model.order.Quotation;
import qien.derdefase.app.model.order.QuotationRequest;
import qien.derdefase.app.model.product.Clamps;
import qien.derdefase.app.model.product.EndConnection;
import qien.derdefase.app.model.product.Product;
import qien.derdefase.app.model.product.SteelWireRope;
import qien.derdefase.app.service.orderservice.QuotationRequestService;
import qien.derdefase.app.service.orderservice.QuotationService;
import qien.derdefase.app.service.productservice.ClampsService;
import qien.derdefase.app.service.productservice.EndConnectionService;
import qien.derdefase.app.service.productservice.ProductService;
import qien.derdefase.app.service.productservice.SteelWireRopeService;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/client")
public class ClientEndpoint {

    @Autowired
    QuotationRequestService quotationRequestService;
    @Autowired
    QuotationService quotationService;
    @Autowired
    SteelWireRopeService steelWireRopeService;
    @Autowired
    EndConnectionService endConnectionService;
    @Autowired
    ClampsService clampsService;
    @Autowired
    ProductService productService;

    // maak nieuwe producten aan
     @PostMapping("/newsteelwirerope")
     public SteelWireRope newSteelWireRope(@RequestBody SteelWireRope steelWireRope){
         return steelWireRopeService.addSteelWireRope(steelWireRope);
     }

     @PostMapping("/newendconnection")
     public EndConnection newEndConnection(@RequestBody EndConnection endConnection){
         return endConnectionService.addEndConnection(endConnection);
     }

     @PostMapping("/newclamps")
     public Clamps newClamps(@RequestBody Clamps clamps){
         return clampsService.addClamps(clamps);
     }

     //laat alle producten zien

     @GetMapping("/allsteelwireropes")
      public Iterable<SteelWireRope> allsteelwireropes() {
        return steelWireRopeService.getAllSteelWireRope();
    }

    @GetMapping("/allendconnections")
    public Iterable<EndConnection> allendconnections() {
        return endConnectionService.getEndConnections();
    }

    @GetMapping("/allclamps")
    public Iterable<Clamps> allclamps() {
        return clampsService.getClamps();
    }

    //maak nieuwe quotation request
    @PostMapping("/newquotation/{steelWireRopeId}/{endConnectionId}/{clampsId}")
    public QuotationRequest newRequest(@RequestBody QuotationRequest quotationRequest, @PathVariable(value = "steelWireRopeId") long steelWireRopeId, @PathVariable(value = "endConnectionId") long endConnectionId, @PathVariable(value = "clampsId") long clampsId) {
        System.out.println("new quotation request");
        System.out.println("shipping method" + quotationRequest.getShippingMethod());
        return quotationRequestService.newQuotationRequest(new QuotationRequest(quotationRequest, steelWireRopeService.getById(steelWireRopeId), endConnectionService.getById(endConnectionId), clampsService.getById(clampsId)));
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
