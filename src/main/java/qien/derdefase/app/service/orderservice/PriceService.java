package qien.derdefase.app.service.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qien.derdefase.app.model.order.Price;
import qien.derdefase.app.model.order.QuotationRequest;
import qien.derdefase.app.model.product.Clamps;
import qien.derdefase.app.service.productservice.ClampsService;

import javax.transaction.Transactional;

@Service
@Transactional
public class PriceService {

    @Autowired
    PriceRepository priceRepository;

    public Price getById(long id) {
        System.out.println("Price gevonden met id" + id);
        return priceRepository.findById(id).get();
    }

    public Price getPrice(QuotationRequest quotationRequest) {
        return priceRepository.save(new Price(quotationRequest));
    }
}
