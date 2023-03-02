package pl.gajewski;

import java.util.ArrayList;
import java.util.List;

public class BlockOB implements CompositeBlock {
    private String name;
    private String color;
    private String material;

    public BlockOB(String name, String color, String material) {
        this.name = name;
        this.color = color;
        this.material = material;
    }

    public BlockOB() {
    }

    public List<BlockOB> createBlocks() {
        List<BlockOB> blockList = new ArrayList<>();
        BlockOB block1 = new BlockOB("Nike", "Red", "Silicate");
        BlockOB block2 = new BlockOB("Amazom", "Red", "Brick");
        BlockOB block3 = new BlockOB("Yangtze", "Green", "Concrete");
        BlockOB block4 = new BlockOB("Mississippi", "White", "Brick");
        BlockOB block5 = new BlockOB("Niger", "Grey", "Concrete");
        BlockOB block6 = new BlockOB("Volga", "Black", "Brick");
        BlockOB block7 = new BlockOB("Odra", "White", "Concrete");
        BlockOB block8 = new BlockOB("Warta", "Red", "Concrete");
        BlockOB block9 = new BlockOB("Pilica", "White", "Concrete");
        blockList.add(block1);
        blockList.add(block2);
        blockList.add(block3);
        blockList.add(block4);
        blockList.add(block5);
        blockList.add(block6);
        blockList.add(block7);
        blockList.add(block8);
        blockList.add(block9);
        return blockList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "\n" + name + " " + material + " " + color;
    }

    @Override
    public List<BlockOB> getBlocks() {
        return createBlocks();
    }

    public BlockOB getBlock() {
        BlockOB block = new BlockOB();
        block.setName(name);
        block.setColor(color);
        block.setMaterial(material);
        return block;
    }
}
