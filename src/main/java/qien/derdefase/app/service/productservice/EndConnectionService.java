package qien.derdefase.app.service.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qien.derdefase.app.model.product.EndConnection;
import qien.derdefase.app.model.product.Product;
import qien.derdefase.app.model.product.MaterialEndconnection;

import javax.transaction.Transactional;

@Service
@Transactional
public class EndConnectionService{

    @Autowired
    EndConnectionRepository endConnectionRepository;

    public EndConnection addEndConnection(EndConnection endConnection) {
        return endConnectionRepository.save(endConnection);
    }

    public Iterable<EndConnection> getEndConnections() {
        return endConnectionRepository.findAll();
    }

    public EndConnection getById(long endConnectionId) {
        return endConnectionRepository.findById(endConnectionId).get();
    }
}
