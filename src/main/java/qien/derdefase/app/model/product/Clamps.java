package qien.derdefase.app.model.product;

import javax.persistence.Entity;

@Entity
public class Clamps extends Product {

    SizeClamps sizeClamps;

    public Clamps() {
        this.productionHours = 5;
        this.productCosts = 30;
        this.weightInKilos = 7;
        this.height = 10;
        this.width = 20;
        this.depth = 7;
    }

    public SizeClamps getSizeClamps() {
        return sizeClamps;
    }

    public void setSizeClamps(SizeClamps sizeClamps) {
        this.sizeClamps = sizeClamps;
    }
}
