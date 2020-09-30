package qien.derdefase.app.service.clientservice;

import org.springframework.data.repository.CrudRepository;
import qien.derdefase.app.model.client.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {
}
