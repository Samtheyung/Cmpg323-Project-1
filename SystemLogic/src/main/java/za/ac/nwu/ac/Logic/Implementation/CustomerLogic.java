package za.ac.nwu.ac.Logic.Implementation;
import za.ac.nwu.ac.Logic.Flow.Customers;
import za.ac.nwu.ac.domain.dto.CustomerInfodto;
import org.springframework.stereotype.Component;
import java.util.List;

@Component


public interface CustomerLogic {
    public List<CustomerInfodto> getAllCustomers();
}
