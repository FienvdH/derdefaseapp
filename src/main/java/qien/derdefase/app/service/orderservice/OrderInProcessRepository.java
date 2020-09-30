package qien.derdefase.app.service.orderservice;

import org.springframework.data.repository.CrudRepository;
import qien.derdefase.app.model.department.Sales;
import qien.derdefase.app.model.order.OrderInProcess;

public interface OrderInProcessRepository extends CrudRepository<OrderInProcess, Long> {
}
