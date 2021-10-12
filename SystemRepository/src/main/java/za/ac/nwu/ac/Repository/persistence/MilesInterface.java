package za.ac.nwu.ac.Repository.persistence;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.nwu.ac.domain.persistence.Miles;

@Repository

public interface MilesInterface extends JpaRepository<Miles,String>{

}
