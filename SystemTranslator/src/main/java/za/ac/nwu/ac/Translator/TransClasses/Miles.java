package za.ac.nwu.ac.Translator.TransClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.Repository.persistence.MilesInterface;
import za.ac.nwu.ac.Translator.Implemenation.MilesImpl;
import za.ac.nwu.ac.domain.dto.Milesdto;
import za.ac.nwu.ac.domain.dto.CustomerInfodto;

import java.util.ArrayList;
import java.util.List;

@Component
public class Miles implements MilesImpl {
    private final MilesInterface milesRepo;

    @Autowired
    public Miles(MilesInterface milesRepo) {
        this.milesRepo = milesRepo;
    }


    public List<Milesdto> getMilesToday() {
        List<Milesdto> milesDto = new ArrayList<>();
        try {
            for (za.ac.nwu.ac.domain.persistence.Miles miles : milesRepo.findAll()) {
                milesDto.add(new Milesdto(miles));
            }
        } catch (Exception e) {
            throw new RuntimeException("Cannot get customers from the db", e);
        }
        return milesDto;
    }

    @Override
    public List<Milesdto> getMiles() {
        return null;
    }

    @Override
    public Iterable<? extends za.ac.nwu.ac.domain.persistence.Miles> findAll() {
        return null;
    }
}
