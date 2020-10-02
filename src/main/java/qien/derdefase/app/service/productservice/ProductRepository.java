package qien.derdefase.app.service.productservice;

import org.springframework.data.repository.CrudRepository;
import qien.derdefase.app.model.product.Clamps;
import qien.derdefase.app.model.product.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
