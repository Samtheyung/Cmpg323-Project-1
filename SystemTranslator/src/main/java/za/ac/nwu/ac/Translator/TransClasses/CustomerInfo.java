package za.ac.nwu.ac.Translator.TransClasses;

import za.ac.nwu.ac.domain.dto.CustomerInfodto;
import za.ac.nwu.ac.Repository.persistence.CustomerInfoInterface;
import za.ac.nwu.ac.Translator.Implemenation.CustomerInfoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.persistence.Miles;


import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerInfo implements CustomerInfoImpl {
    private CustomerInfoInterface customerInfoInterface;
    @Autowired
    public void CustomerInfoImpl(CustomerInfoInterface customerInfoInterface)
    {
        this.customerInfoInterface = customerInfoInterface;
    }

    public CustomerInfo(CustomerInfoInterface customerInfoInterface) {
        this.customerInfoInterface = customerInfoInterface;
    }
    @Override
    public static List<CustomerInfodto> getCustomerInfo(){
        List<CustomerInfodto> customerInfodtos = new ArrayList<>();
        try{
            for (
                    za.ac.nwu.ac.domain.persistence.CustomerInfo ignored :CustomerInfoInterface.findAll()
            {
                    customerInfodtos.add(new CustomerInfodto(za.ac.nwu.ac.domain.persistence.CustomerInfo));
            }
        }catch(Exception e)
        {
            throw new RuntimeException("Cannot get customers from Database");
        }

        return customerInfodtos;
    }

    @Override
    public Iterable<? extends Miles> findAll() {
        return null;
    }

}

