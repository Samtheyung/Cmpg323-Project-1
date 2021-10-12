package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.annotation.Target;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "CustomerInfo")
public class CustomerInfo implements Serializable {
    private static final long serialVersionUID = -282337134058330518l;

    private String Name;
    private String LastName;
    private String ID;
    private String email;
    private int Miles;
    private String reward_voucher;
    private Miles miles;

    private Set<CustomerInfo> CustomerInfo;

    public CustomerInfo() {
    }

    public CustomerInfo(String name, String lastName, String ID, String email, int miles, String reward_voucher, Miles milesID, Set<za.ac.nwu.ac.domain.persistence.CustomerInfo> customerInfo) {
        Name = name;
        LastName = lastName;
        this.ID = ID;
        this.email = email;
        this.Miles = Miles;
        this.reward_voucher = reward_voucher;
        this.Miles = Miles;
        CustomerInfo = customerInfo;
    }

    @ManyToOne(targetEntity = za.ac.nwu.ac.domain.persistence.Miles.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public void setMiles(za.ac.nwu.ac.domain.persistence.Miles miles) {
        this.miles = miles;
    }



    @Id
    @Column(name = "ID")
    public String getID() {
        return ID;}
    public void setID(String ID){this.ID = ID;}

    @Column(name = "Name")
    public String getName() {
        return Name;}
    public void setName(String name) {
        Name = name;
    }

    @Column(name = "LastName")
    public String getLastName() {
        return LastName;}
    public void setLastName(String lastName) {
        LastName = lastName;}

    @Column(name = "Email")
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "Miles")
    public int getMiles() {
        return Miles;
    }
    public void setMiles(int miles) {
        this.Miles = Miles;
    }

    @Column(name = "Reward Voucher")
    public String getReward_voucher() {
        return reward_voucher;
    }
    public void setReward_voucher(String reward_voucher) {
        this.reward_voucher = reward_voucher;
    }

    public Set<za.ac.nwu.ac.domain.persistence.CustomerInfo> getCustomerInfo() {
        return CustomerInfo;
    }

    public void setCustomerInfo(Set<za.ac.nwu.ac.domain.persistence.CustomerInfo> customerInfo) {
        CustomerInfo = customerInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerInfo that = (CustomerInfo) o;
        return Miles == that.Miles && Objects.equals(Name, that.Name) && Objects.equals(LastName, that.LastName) && Objects.equals(ID, that.ID) && Objects.equals(email, that.email) && Objects.equals(reward_voucher, that.reward_voucher) && Objects.equals(miles, that.miles) && Objects.equals(CustomerInfo, that.CustomerInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, LastName, ID, email, Miles, reward_voucher, miles, CustomerInfo);
    }

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", ID='" + ID + '\'' +
                ", email='" + email + '\'' +
                ", Miles=" + Miles +
                ", reward_voucher='" + reward_voucher + '\'' +
                ", milesID=" + miles +
                ", CustomerInfo=" + CustomerInfo +
                '}';
    }
}







