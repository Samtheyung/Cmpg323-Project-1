package za.ac.nwu.ac.Logic.Flow;
import za.ac.nwu.ac.Logic.Implementation.CustomerLogic;
import za.ac.nwu.ac.Translator.Implemenation.CustomerInfoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.nwu.ac.Translator.TransClasses.CustomerInfo;
import za.ac.nwu.ac.domain.dto.CustomerInfodto;
import org.springframework.stereotype.Component;
import javax.transaction.Transaction;
import javax.transaction.Transactional;
import java.util.List;
import java.util.ArrayList;
@Transactional
@Component

public class Customers implements CustomerLogic{
    private CustomerInfo customerinfo;

    @Autowired
    public Customers(CustomerInfo customerinfo)
    {this.customerinfo = customerinfo;}

    @Override
    public List<CustomerInfodto> getAllCustomers(){
        List<CustomerInfodto> customerInfodtos = new ArrayList<>();
        customerInfodtos.add(new CustomerInfodto());

        return CustomerInfo.getCustomerInfo();
    }


}
