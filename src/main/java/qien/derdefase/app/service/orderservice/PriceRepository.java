package qien.derdefase.app.service.orderservice;

import org.springframework.data.repository.CrudRepository;
import qien.derdefase.app.model.department.Sales;
import qien.derdefase.app.model.order.Price;

public interface PriceRepository extends CrudRepository<Price, Long> {
}
