package qien.derdefase.app.model.order;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
abstract public class OrderInProcess {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;
    private ShippingMethod shippingMethod;
    private LocalDate expectedDeliveryDate;
    private int numberOfSteelWireRopes;
    private int numberOfEndConnections;
    private int numberOfClamps;
    private OrderStatus orderStatus;
    @OneToOne
    private Price orderPrice;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Price getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Price orderPrice) {
        this.orderPrice = orderPrice;
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

    public LocalDate getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(LocalDate expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public ShippingMethod getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }
}
