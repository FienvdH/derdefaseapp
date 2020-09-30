package qien.derdefase.app.service.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qien.derdefase.app.model.order.QuotationRequest;

import javax.transaction.Transactional;

@Service
@Transactional
public class QuotationRequestService {

    @Autowired
    QuotationRequestRepository quotationRequestRepository;


    public QuotationRequest newQuotationRequest(QuotationRequest quotationRequest) {
        System.out.println("in qoutationrequestService");
        return quotationRequestRepository.save(quotationRequest);
    }

    public Iterable<QuotationRequest> getAllQuotationRequests() {
        System.out.println("inzien alle offerteaanvragen in database");
        return quotationRequestRepository.findAll();
    }

    public QuotationRequest getById(long id) {
        System.out.println("QuotationRequest gevonden met id" + id);
        return quotationRequestRepository.findById(id).get();
    }
}


