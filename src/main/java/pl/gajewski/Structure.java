package pl.gajewski;

import java.util.List;
import java.util.Optional;

public interface Structure {

    Optional<BlockOB> findBlockByColor(String color);

    List<BlockOB> findBlocksByMaterial(String material);

    int count();
}
