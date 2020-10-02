package qien.derdefase.app.model.product;

import javax.persistence.Entity;

@Entity
public class SteelWireRope extends Product {

    double diameter;
    int numberOfStrings;

    public SteelWireRope() {
        this.productionHours = 3;
        this.productCosts = 75;
        this.weightInKilos = 10;
        this.height = 10;
        this.width = 200;
        this.depth = 10;
    }


    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
