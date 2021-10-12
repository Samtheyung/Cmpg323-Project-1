package za.ac.nwu.ac.domain.dto;
import za.ac.nwu.ac.domain.persistence.CustomerInfo;
import za.ac.nwu.ac.domain.persistence.Miles;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;


public class Milesdto implements Serializable {
    private static final long serialVersionUID = -282337134058330518l;

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC", sequenceName = "VIT_SANDBOX.VIT_RSA_GENERIC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")

    private int MilesToday;
    private int TotalMiles;
    private String MilesID;
    private CustomerInfo customerInfo;

    private Set<Miles> Miles;

    public Milesdto() {
    }

    public Milesdto(int milesToday, int totalMiles, String milesID, CustomerInfo customerInfo, Set<za.ac.nwu.ac.domain.persistence.Miles> miles) {
        MilesToday = milesToday;
        TotalMiles = totalMiles;
        MilesID = milesID;
        this.customerInfo = customerInfo;
        Miles = miles;
    }

    public Milesdto(Miles miles) {

    }

    public int getMilesToday() {
        return MilesToday;
    }

    public void setMilesToday(int milesToday) {
        MilesToday = milesToday;
    }

    public int getTotalMiles() {
        return TotalMiles;
    }

    public void setTotalMiles(int totalMiles) {
        TotalMiles = totalMiles;
    }

    public String getMilesID() {
        return MilesID;
    }

    public void setMilesID(String milesID) {
        MilesID = milesID;
    }

    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    public Set<za.ac.nwu.ac.domain.persistence.Miles> getMiles() {
        return Miles;
    }

    public void setMiles(Set<za.ac.nwu.ac.domain.persistence.Miles> miles) {
        Miles = miles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Milesdto milesdto = (Milesdto) o;
        return MilesToday == milesdto.MilesToday && TotalMiles == milesdto.TotalMiles && Objects.equals(MilesID, milesdto.MilesID) && Objects.equals(customerInfo, milesdto.customerInfo) && Objects.equals(Miles, milesdto.Miles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MilesToday, TotalMiles, MilesID, customerInfo, Miles);
    }

    @Override
    public String toString() {
        return "Milesdto{" +
                "MilesToday=" + MilesToday +
                ", TotalMiles=" + TotalMiles +
                ", MilesID='" + MilesID + '\'' +
                ", customerInfo=" + customerInfo +
                ", Miles=" + Miles +
                '}';
    }
}
