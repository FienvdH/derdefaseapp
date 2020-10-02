package qien.derdefase.app.model.product;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long productId;
    int productionHours;
    double productCosts;
    double weightInKilos;
    double height;
    double width;
    double depth;
    int quantity;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long assemblyProductId) {
        this.productId = assemblyProductId;
    }

    public int getProductionHours() {
        return productionHours;
    }

    public void setProductionHours(int productionHours) {
        this.productionHours = productionHours;
    }

    public double getProductCosts() {
        return productCosts;
    }

    public void setProductCosts(double productCosts) {
        this.productCosts = productCosts;
    }

    public double getWeightInKilos() {
        return weightInKilos;
    }

    public void setWeightInKilos(double weightInKilos) {
        this.weightInKilos = weightInKilos;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

   public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
