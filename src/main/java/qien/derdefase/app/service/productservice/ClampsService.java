package qien.derdefase.app.service.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qien.derdefase.app.model.product.Clamps;

import javax.transaction.Transactional;

@Service
@Transactional
public class ClampsService {

    @Autowired
    ClampsRepository clampsRepository;


    public Clamps addClamps(Clamps clamps) {
        return clampsRepository.save(clamps);
    }

    public Iterable<Clamps> getClamps() {
        return clampsRepository.findAll();
    }

    public Clamps getById(long clampsId) {
        return clampsRepository.findById(clampsId).get();
    }
}
