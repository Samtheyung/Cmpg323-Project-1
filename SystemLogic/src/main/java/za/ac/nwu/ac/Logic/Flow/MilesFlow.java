package za.ac.nwu.ac.Logic.Flow;
import za.ac.nwu.ac.Logic.Implementation.MilesLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.Milesdto;

import javax.transaction.Transactional;
import java.util.List;
import java.util.ArrayList;
@Transactional
@Component


public class MilesFlow implements MilesLogic {
    private za.ac.nwu.ac.Translator.TransClasses.Miles miles;

    @Autowired
    public MilesFlow(za.ac.nwu.ac.Translator.TransClasses.Miles miles1)
    {this.miles = miles1;}

    @Override
    public List<Milesdto> getAllMiles(){
        List<Milesdto> milesdtos = new ArrayList<>();
        milesdtos.add(new Milesdto());
        return MilesFlow.getMiles();
    }

    private static List<Milesdto> getMiles() {
        return getMiles();
    }
}
