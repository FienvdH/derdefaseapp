package qien.derdefase.app.model.order;

import qien.derdefase.app.model.product.Clamps;
import qien.derdefase.app.model.product.EndConnection;
import qien.derdefase.app.model.product.SteelWireRope;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class QuotationRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long quotationRequestId;
    private ShippingMethod shippingMethod;
    private LocalDate deliveryDate;
    @OneToOne
    private SteelWireRope steelWireRope;
    @OneToOne
    private EndConnection endConnection;
    @OneToOne
    private Clamps clamps;

    public QuotationRequest(){

    }

    public QuotationRequest(QuotationRequest quotationRequest, SteelWireRope steelWireRope, EndConnection endConnection, Clamps clamps) {
        this.shippingMethod = quotationRequest.shippingMethod;
        this.deliveryDate = quotationRequest.deliveryDate;
        this.steelWireRope = steelWireRope;
        this.endConnection = endConnection;
        this.clamps = clamps;
    }

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

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
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
}
