package za.ac.nwu.ac.Translator.Implemenation;

import za.ac.nwu.ac.domain.dto.Milesdto;
import za.ac.nwu.ac.domain.persistence.Miles;

import java.util.List;

public interface MilesImpl {
    List<Milesdto> getMiles();

    Iterable<? extends Miles> findAll();
}
