package pl.gajewski;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Wall implements Structure {

    private List<BlockOB> blocks;

    BlockOB blockOB = new BlockOB();

    @Override
    public Optional<BlockOB> findBlockByColor(String request) {
        String color = request.toLowerCase();
        this.blocks = blockOB.getBlocks();
        return blocks.stream().map(BlockOB::getBlock)
                .filter(blockOB -> blockOB.getColor().equals(color.substring(0, 1).toUpperCase() + color.substring(1)))
                .findAny();
    }

    public void displayBlockByColor(String color) {
        if (validate(color)) {
            Optional<BlockOB> result = findBlockByColor(color);
            if (result.isPresent()) {
                System.out.println("Color block search results " + color + ": " + result.get() + "\n");
            } else {
                displayEmptyResult();
            }
        } else {
            displayEmptyResult();
        }
    }

    @Override
    public List<BlockOB> findBlocksByMaterial(String request) {
        String material = request.toLowerCase();
        this.blocks = blockOB.getBlocks();
        return blocks.stream().map(BlockOB::getBlock)
                .filter(blockOB -> blockOB.getMaterial().equals(material.substring(0, 1).toUpperCase() + material.substring(1)))
                .sorted(Comparator.comparing(BlockOB::getName))
                .collect(Collectors.toList());
    }

    public void displayBlocksByMaterial(String material) {
        if (validate(material)) {
            List<BlockOB> result = findBlocksByMaterial(material);
            if (!result.isEmpty()) {
                System.out.println("Block search results from " + material + ": " + result + "\n");
            } else {
                displayEmptyResult();
            }
        } else {
            displayEmptyResult();
        }
    }

    private void displayEmptyResult() {
        System.out.println("The list is empty. Check the search criteria.");
    }

    private boolean validate(String temp) {
        return temp != null && !temp.isEmpty();
    }

    @Override
    public int count() {
        return blockOB.getBlocks().size();
    }

    public void writeCountElements() {
        System.out.println("Number of elements: " + count());
    }

    public void writeAllElements() {
        if (getAllElements().isEmpty()) {
            displayEmptyResult();
        } else {
            System.out.println("List elements: " + getAllElements());
        }

    }

    private List<BlockOB> getAllElements() {
        return blockOB.getBlocks().stream()
                .sorted(Comparator.comparing(BlockOB::getName))
                .collect(Collectors.toList());
    }
}
