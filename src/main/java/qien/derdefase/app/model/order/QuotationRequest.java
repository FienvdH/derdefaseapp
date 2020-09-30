package qien.derdefase.app.model.order;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class QuotationRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long quotationRequestId;
    private ShippingMethod shippingMethod;
    private LocalDate deliveryDate;
    private int numberOfSteelWireRopes;
    private int numberOfEndConnections;
    private int numberOfClamps;

    //getters en setters

    public long getQuotationRequestId() {
        return quotationRequestId;
    }

    public void setQuotationRequestId(long quotationRequestId) {
        this.quotationRequestId = quotationRequestId;
    }

    public ShippingMethod getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public int getNumberOfSteelWireRopes() {
        return numberOfSteelWireRopes;
    }

    public void setNumberOfSteelWireRopes(int numberOfSteelWireRopes) {
        this.numberOfSteelWireRopes = numberOfSteelWireRopes;
    }

    public int getNumberOfEndConnections() {
        return numberOfEndConnections;
    }

    public void setNumberOfEndConnections(int numberOfEndConnections) {
        this.numberOfEndConnections = numberOfEndConnections;
    }

    public int getNumberOfClamps() {
        return numberOfClamps;
    }

    public void setNumberOfClamps(int numberOfClamps) {
        this.numberOfClamps = numberOfClamps;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

}
