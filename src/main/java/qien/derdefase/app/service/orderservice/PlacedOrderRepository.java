package qien.derdefase.app.service.orderservice;

import org.springframework.data.repository.CrudRepository;
import qien.derdefase.app.model.department.Sales;
import qien.derdefase.app.model.order.PlacedOrder;

public interface PlacedOrderRepository extends CrudRepository<PlacedOrder, Long> {
}
