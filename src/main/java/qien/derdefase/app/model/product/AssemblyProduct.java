package qien.derdefase.app.model.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AssemblyProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long assemblyProductId;

}
