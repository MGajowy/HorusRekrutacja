package pl.gajewski;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Wall wall = new Wall();
        wall.writeAllElements();
        wall.writeCountElements();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a color for the block: ");
        String color = scanner.nextLine();
        wall.displayBlockByColor(color);

        System.out.println("Enter the type of material: ");
        String material = scanner.nextLine();
        wall.displayBlocksByMaterial(material);
    }
}
