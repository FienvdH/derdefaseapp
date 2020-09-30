package qien.derdefase.app.model.product;

import javax.persistence.Entity;

@Entity
public class EndConnection extends Product {

    //MaterialEndconnection materialEndconnection;
    int minimumBreakingLoadInKilos;

    public EndConnection() {
        this.productionHours = 3;
        this.productCosts = 100;
        this.weightInKilos = 23;
        this.height = 18;
        this.width = 18;
        this.depth = 20;
        this.minimumBreakingLoadInKilos = 500;
    }
}
