package qien.derdefase.app.model.department;

import javax.persistence.Entity;

@Entity
public class Production extends Department {

    int productionCapacityInHours;
    int pricePerHour;

    public Production() {
        this.pricePerHour = 15;
    }

    public int getProductionCapacityInHours() {
        return productionCapacityInHours;
    }

    public void setProductionCapacityInHours(int productionCapacityInHours) {
        this.productionCapacityInHours = productionCapacityInHours;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }




}
