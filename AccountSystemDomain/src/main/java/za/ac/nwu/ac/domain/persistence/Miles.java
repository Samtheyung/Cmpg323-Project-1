package za.ac.nwu.ac.domain.persistence;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Miles")


public class Miles implements Serializable {
    private static final long serialVersionUID = -282337134058330518l;

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC", sequenceName = "VIT_SANDBOX.VIT_RSA_GENERIC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")

    private int MilesToday;
    private int TotalMiles;
    private String MilesID;
    private CustomerInfo customerInfo;

    public Miles() {
    }

    public Miles(int milesToday, int totalMiles, String milesID, CustomerInfo customerInfo) {
        MilesToday = milesToday;
        TotalMiles = totalMiles;
        MilesID = milesID;
        this.customerInfo = customerInfo;
    }

    @Column(name = "MilesID")
    public void setMilesID(String milesID) {
        MilesID = milesID;
    }
    public String getMilesID() {
        return MilesID;
    }


    @Column(name = "Miles Today")
    public void setMilesToday(int milesToday) {
        MilesToday = milesToday;
    }
    public int getMilesToday() {
        return MilesToday;
    }

    @Column(name = "Total Miles")
    public int getTotalMiles() {
        return TotalMiles;
    }
    public void setTotalMiles(int totalMiles) {
        TotalMiles = totalMiles;
    }

    @OneToOne
    @JoinColumn(name = "ID")
    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Miles miles = (Miles) o;
        return MilesToday == miles.MilesToday && TotalMiles == miles.TotalMiles && Objects.equals(MilesID, miles.MilesID) && Objects.equals(customerInfo, miles.customerInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MilesToday, TotalMiles, MilesID, customerInfo);
    }

    @Override
    public String toString() {
        return "Miles{" +
                "MilesToday=" + MilesToday +
                ", TotalMiles=" + TotalMiles +
                ", MilesID='" + MilesID + '\'' +
                ", customerInfo=" + customerInfo +
                '}';
    }
}
