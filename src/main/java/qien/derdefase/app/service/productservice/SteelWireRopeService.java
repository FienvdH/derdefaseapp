package qien.derdefase.app.service.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qien.derdefase.app.model.product.Product;
import qien.derdefase.app.model.product.MaterialEndconnection;
import qien.derdefase.app.model.product.SteelWireRope;

import javax.transaction.Transactional;

@Service
@Transactional
public class SteelWireRopeService{

    @Autowired
    SteelWireRopeRepository steelWireRopeRepository;

    public SteelWireRope addSteelWireRope(SteelWireRope steelWireRope) {
        return steelWireRopeRepository.save(steelWireRope);
    }

    public Iterable<SteelWireRope> getAllSteelWireRope() {
        return steelWireRopeRepository.findAll();
    }

    public SteelWireRope getById(long id) {
        return steelWireRopeRepository.findById(id).get();
    }
}
