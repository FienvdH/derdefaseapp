package qien.derdefase.app.model.order;

import qien.derdefase.app.model.product.Clamps;
import qien.derdefase.app.model.product.EndConnection;
import qien.derdefase.app.model.product.SteelWireRope;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
abstract public class OrderInProcess {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;
    private ShippingMethod shippingMethod;
    private LocalDate expectedDeliveryDate;
    @OneToOne
    private SteelWireRope steelWireRope;
    @OneToOne
    private EndConnection endConnection;
    @OneToOne
    private Clamps clamps;
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

    public SteelWireRope getSteelWireRope() {
        return steelWireRope;
    }

    public void setSteelWireRope(SteelWireRope steelWireRope) {
        this.steelWireRope = steelWireRope;
    }

    public EndConnection getEndConnection() {
        return endConnection;
    }

    public void setEndConnection(EndConnection endConnection) {
        this.endConnection = endConnection;
    }

    public Clamps getClamps() {
        return clamps;
    }

    public void setClamps(Clamps clamps) {
        this.clamps = clamps;
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
