package qien.derdefase.app.model.order;

import org.springframework.beans.factory.annotation.Autowired;
import qien.derdefase.app.model.department.Production;
import qien.derdefase.app.model.product.Clamps;
import qien.derdefase.app.model.product.EndConnection;
import qien.derdefase.app.model.product.SteelWireRope;

import javax.persistence.*;

@Entity
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long priceId;
    private double logisticCosts;
    private double productCosts;
    private double productionCosts;
    private double margin;
    private double total;
//    @OneToOne
//    QuotationRequest quotationRequest;
//    @OneToOne
//    Clamps clamps;
//    @OneToOne
//    EndConnection endConnection;
//    @OneToOne
//    SteelWireRope steelWireRope;


    //constructors

    public Price() {

    }

    public Price(QuotationRequest quotationRequest) {
        this.logisticCosts = this.calculateLogisticCosts(quotationRequest);
        this.productCosts = this.calculateProductCosts(quotationRequest);
        this.productionCosts = this.calculateProductionCosts(quotationRequest);
        this.margin = (logisticCosts + productionCosts + productionCosts) * 0.2;
        this.total = logisticCosts + productionCosts + productionCosts + margin;
            }




    // getters en setters


    public long getPriceId() {
        return priceId;
    }

    public void setPriceId(long priceId) {
        this.priceId = priceId;
    }

    public double getLogisticCosts() {
        return logisticCosts;
    }

    public void setLogisticCosts(double logisticCosts) {
        this.logisticCosts = logisticCosts;
    }

    public double getProductCosts() {
        return productCosts;
    }

    public void setProductCosts(double productCosts) {
        this.productCosts = productCosts;
    }

    public double getProductionCosts() {
        return productionCosts;
    }

    public void setProductionCosts(double productionCosts) {
        this.productionCosts = productionCosts;
    }

    public double getMargin() {
        return margin;
    }

    public void setMargin(double margin) {
        margin = margin;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
//berekenen product costs
    //nu new object aangemaakt, kan dat vervangen worden door iets anders, List met objecten van de classes?
    //lelijk als er bijvoorbeeld maar 1 soort product wordt gevraagd, onhandig als er nieuwe producten bijkomen

    private double calculateProductCosts(QuotationRequest quotationRequest){
        return quotationRequest.getNumberOfClamps() * new Clamps().getProductCosts() + quotationRequest.getNumberOfEndConnections() + new EndConnection().getProductCosts()
                + quotationRequest.getNumberOfSteelWireRopes() * new SteelWireRope().getProductCosts();
    }

    // berekenen shipping costs, nu in vaste bedragen, later nog percentage
    private double calculateLogisticCosts(QuotationRequest quotationRequest) {
        System.out.println("" + quotationRequest.getShippingMethod());
        if (quotationRequest.getShippingMethod().toString().equals("STANDARD")){
            return 1500;
        } else {return 2000;}
        }


    //berekenen productiekosten

    private double calculateProductionCosts(QuotationRequest quotationRequest) {
        return quotationRequest.getNumberOfClamps() * new Clamps().getProductionHours()  + quotationRequest.getNumberOfEndConnections() + new EndConnection().getProductionHours()
                + quotationRequest.getNumberOfSteelWireRopes() * new SteelWireRope().getProductionHours() * new Production().getPricePerHour();
    }
}






