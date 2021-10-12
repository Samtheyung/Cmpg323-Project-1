package za.ac.nwu.ac.domain.dto;


import za.ac.nwu.ac.domain.persistence.CustomerInfo;

import java.io.Serializable;
import java.util.Set;

public class CustomerInfodto implements Serializable {

    private String Name;
    private String LastName;
    private String ID;
    private String email;
    private int miles;
    private String reward_voucher;

    private Set<za.ac.nwu.ac.domain.persistence.CustomerInfo> CustomerInfo;

    public CustomerInfodto() {
    }

    public CustomerInfodto(String name, String lastName, String ID, String email, int miles, String reward_voucher) {
        Name = name;
        LastName = lastName;
        this.ID = ID;
        this.email = email;
        this.miles = miles;
        this.reward_voucher = reward_voucher;
    }
    public CustomerInfodto(CustomerInfo customerinfo)
    {
        this.ID = customerinfo.getID();
        this.Name = customerinfo.getName();
        this.LastName = customerinfo.getLastName();
        this.email = customerinfo.getEmail();
        this.miles = customerinfo.getMiles();
        this.reward_voucher = customerinfo.getReward_voucher();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public String getReward_voucher() {
        return reward_voucher;
    }

    public void setReward_voucher(String reward_voucher) {
        this.reward_voucher = reward_voucher;
    }

    @Override
    public String toString() {
        return "CustomerInfodto{" +
                "Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", ID='" + ID + '\'' +
                ", email='" + email + '\'' +
                ", miles=" + miles +
                ", reward_voucher='" + reward_voucher + '\'' +
                '}';
    }
}
