package qien.derdefase.app.service.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qien.derdefase.app.model.order.Quotation;
import qien.derdefase.app.model.order.QuotationStatus;

import javax.transaction.Transactional;

@Service
@Transactional
public class QuotationService {

    @Autowired
    QuotationRepository quotationRepository;

    public Quotation newQuotation(Quotation quotation) {
        return quotationRepository.save(quotation);
    }

    public Quotation acceptQuotation(long id) {
        quotationRepository.findById(id).get().setQuotationStatus(QuotationStatus.ACCEPTED);
        return quotationRepository.save(quotationRepository.findById(id).get());
    }

    public Quotation notAcceptQuotation(long id) {
        quotationRepository.findById(id).get().setQuotationStatus(QuotationStatus.NOTACCEPTED);
        return quotationRepository.save(quotationRepository.findById(id).get());
    }
}
