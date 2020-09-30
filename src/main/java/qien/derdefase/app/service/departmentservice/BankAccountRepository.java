package qien.derdefase.app.service.departmentservice;

import org.springframework.data.repository.CrudRepository;
import qien.derdefase.app.model.client.Client;
import qien.derdefase.app.model.department.BankAccount;

public interface BankAccountRepository extends CrudRepository<BankAccount, Long> {
}
