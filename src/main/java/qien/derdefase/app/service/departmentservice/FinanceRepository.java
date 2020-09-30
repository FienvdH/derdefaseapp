package qien.derdefase.app.service.departmentservice;

import org.springframework.data.repository.CrudRepository;
import qien.derdefase.app.model.client.Client;
import qien.derdefase.app.model.department.Finance;

public interface FinanceRepository extends CrudRepository<Finance, Long> {
}
