// org/example/Main.java
package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        // Create objects for bedroom
        Wall northWall = new Wall("North");
        Wall southWall = new Wall("South");
        Wall eastWall = new Wall("East");
        Wall westWall = new Wall("West");

        Ceiling bedroomCeiling = new Ceiling(300, PaintColor.WHITE);
        Bed masterBed = new Bed("King Size", 4, 60, 2, 1);
        Lamp bedLamp = new Lamp(LampType.NEON, true, 75);
        Wardrobe bedroomWardrobe = new Wardrobe(180, 220, 85.5);
        Carpet floorCarpet = new Carpet(200, 300, PaintColor.RED);

        // Create bedroom
        Bedroom masterBedroom = new Bedroom("Master Bedroom", northWall, southWall,
                eastWall, westWall, bedroomCeiling, masterBed,
                bedLamp, bedroomWardrobe, floorCarpet);

        // Test all functionalities
        System.out.println("=== Testing Bedroom: " + masterBedroom.getName() + " ===");

        // Test walls
        System.out.println("\n--- Wall Tests ---");
        masterBedroom.getWall1().create();
        System.out.println("Wall1 direction: " + masterBedroom.getWall1().getDirection());
        masterBedroom.getWall2().create();
        System.out.println("Wall2 direction: " + masterBedroom.getWall2().getDirection());
        masterBedroom.getWall3().create();
        System.out.println("Wall3 direction: " + masterBedroom.getWall3().getDirection());
        masterBedroom.getWall4().create();
        System.out.println("Wall4 direction: " + masterBedroom.getWall4().getDirection());

        // Test ceiling
        System.out.println("\n--- Ceiling Tests ---");
        masterBedroom.getCeiling().create();
        System.out.println("Ceiling height: " + masterBedroom.getCeiling().getHeight());
        System.out.println("Ceiling color: " + masterBedroom.getCeiling().getColor());

        // Test bed
        System.out.println("\n--- Bed Tests ---");
        masterBedroom.getBed().make();
        System.out.println("Bed pillows: " + masterBedroom.getBed().getPillows());
        System.out.println("Bed height: " + masterBedroom.getBed().getHeight());
        System.out.println("Bed sheets: " + masterBedroom.getBed().getSheets());
        System.out.println("Bed quilts: " + masterBedroom.getBed().getQuilts());

        // Test lamp
        System.out.println("\n--- Lamp Tests ---");
        masterBedroom.getLamp().turnOn();
        System.out.println("Lamp style: " + masterBedroom.getLamp().getStyle());
        System.out.println("Lamp battery: " + masterBedroom.getLamp().isBattery());
        System.out.println("Lamp rating: " + masterBedroom.getLamp().getGlobRating());

        // Test wardrobe
        System.out.println("\n--- Wardrobe Tests ---");
        masterBedroom.getWardrobe().add();
        System.out.println("Wardrobe width: " + masterBedroom.getWardrobe().getWidth());
        System.out.println("Wardrobe height: " + masterBedroom.getWardrobe().getHeight());
        System.out.println("Wardrobe weight: " + masterBedroom.getWardrobe().getWeight());

        // Test carpet
        System.out.println("\n--- Carpet Tests ---");
        masterBedroom.getCarpet().lying();
        System.out.println("Carpet width: " + masterBedroom.getCarpet().getWidth());
        System.out.println("Carpet height: " + masterBedroom.getCarpet().getHeight());
        System.out.println("Carpet color: " + masterBedroom.getCarpet().getColor());

        System.out.println("\n=== All Tests Completed Successfully! ===");
    }
}