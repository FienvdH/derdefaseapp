package qien.derdefase.app.service.orderservice;

import org.springframework.data.repository.CrudRepository;
import qien.derdefase.app.model.department.Sales;
import qien.derdefase.app.model.order.Quotation;

public interface QuotationRepository extends CrudRepository<Quotation, Long> {
}
