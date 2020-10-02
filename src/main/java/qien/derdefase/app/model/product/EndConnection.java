package qien.derdefase.app.model.product;

import javax.persistence.Entity;

@Entity
public class EndConnection extends Product {

    private MaterialEndconnection materialEndconnection;
    private int minimumBreakingLoadInKilos;

    public EndConnection() {
        this.productionHours = 2;
        this.productCosts = 50;
        this.weightInKilos = 15;
        this.height = 15;
        this.width = 15;
        this.depth = 12;
    }

    public MaterialEndconnection getMaterialEndconnection() {
        return materialEndconnection;
    }

    public void setMaterialEndconnection(MaterialEndconnection materialEndconnection) {
        this.materialEndconnection = materialEndconnection;
    }

    public int getMinimumBreakingLoadInKilos() {
        return minimumBreakingLoadInKilos;
    }

    public void setMinimumBreakingLoadInKilos(int minimumBreakingLoadInKilos) {
        this.minimumBreakingLoadInKilos = minimumBreakingLoadInKilos;
    }


}
