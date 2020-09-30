package qien.derdefase.app.service.departmentservice;

import org.springframework.data.repository.CrudRepository;
import qien.derdefase.app.model.client.Client;
import qien.derdefase.app.model.department.Production;

public interface ProductionRepository extends CrudRepository<Production, Long> {
}
