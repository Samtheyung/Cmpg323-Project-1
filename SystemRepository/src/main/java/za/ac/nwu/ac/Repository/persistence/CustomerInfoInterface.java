package za.ac.nwu.ac.Repository.persistence;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.nwu.ac.domain.persistence.CustomerInfo;


@Repository
public interface CustomerInfoInterface extends JpaRepository<CustomerInfo,String>{

}
