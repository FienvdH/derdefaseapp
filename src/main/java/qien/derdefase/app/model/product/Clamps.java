package qien.derdefase.app.model.product;

import javax.persistence.Entity;

@Entity
public class Clamps extends Product {

    //SizeClamps sizeClamps;

    public Clamps() {
        this.productionHours = 2;
        this.productCosts = 50;
        this.weightInKilos = 10;
        this.height = 15;
        this.width = 12;
        this.depth = 7;
    }
}
