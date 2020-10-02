package qien.derdefase.app.service.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qien.derdefase.app.model.order.QuotationRequest;
import qien.derdefase.app.model.product.Clamps;
import qien.derdefase.app.model.product.Product;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Iterable<Product> getAllProducts() {
        System.out.println("haal alle producten op");
        return productRepository.findAll();
    }

}
