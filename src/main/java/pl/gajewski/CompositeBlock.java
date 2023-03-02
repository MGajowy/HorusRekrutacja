package pl.gajewski;

import java.util.List;

public interface CompositeBlock extends Block {
    List<BlockOB> getBlocks();
}
