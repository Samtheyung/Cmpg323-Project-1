package za.ac.nwu.ac.Logic.Implementation;
import za.ac.nwu.ac.domain.dto.Milesdto;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface MilesLogic {
    public List<Milesdto> getAllMiles();
}
