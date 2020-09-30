package qien.derdefase.app.service.orderservice;

import org.springframework.data.repository.CrudRepository;
import qien.derdefase.app.model.department.Sales;
import qien.derdefase.app.model.order.QuotationRequest;

public interface QuotationRequestRepository extends CrudRepository<QuotationRequest, Long> {
}
