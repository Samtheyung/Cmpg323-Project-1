package za.ac.nwu.ac.Translator.Implemenation;
import za.ac.nwu.ac.Translator.TransClasses.CustomerInfo;
import za.ac.nwu.ac.domain.dto.CustomerInfodto;
import za.ac.nwu.ac.domain.persistence.Miles;

import java.util.List;

public interface CustomerInfoImpl {
    List<CustomerInfodto> getCustomerInfo();

    Iterable<? extends Miles> findAll();
}
