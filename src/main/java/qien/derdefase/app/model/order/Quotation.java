package qien.derdefase.app.model.order;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity
public class Quotation extends OrderInProcess {

    private QuotationStatus quotationStatus;

    public Quotation() {
    }

    public Quotation(QuotationRequest quotationRequest, Price price) {
        super();
        this.setShippingMethod(quotationRequest.getShippingMethod());
        this.setExpectedDeliveryDate(quotationRequest.getDeliveryDate());
        this.setSteelWireRope(quotationRequest.getSteelWireRope());
        this.setEndConnection(quotationRequest.getEndConnection());
        this.setClamps(quotationRequest.getClamps());
        //set orderStatus
        //eerst Price orderPrice aanmaken en opslaan in database?
        this.setOrderPrice(price);
        this.quotationStatus = QuotationStatus.PROCESSED;
    }

    public QuotationStatus getQuotationStatus() {
        return quotationStatus;
    }

    public void setQuotationStatus(QuotationStatus quotationStatus) {
        this.quotationStatus = quotationStatus;
    }
}

