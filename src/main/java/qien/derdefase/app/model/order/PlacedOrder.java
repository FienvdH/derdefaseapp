package qien.derdefase.app.model.order;

import javax.persistence.Entity;

@Entity
public class PlacedOrder extends OrderInProcess {

    private PaymentStatus paymentStatus;

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
