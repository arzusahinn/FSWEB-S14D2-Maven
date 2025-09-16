// org/example/model/EnhancedBedroom.java
// BONUS - Enhanced Bedroom that extends Room (Inheritance + Composition)
package org.example.model;

public class EnhancedBedroom extends Room {
    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public EnhancedBedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4,
                           Ceiling ceiling, Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet) {
        // Call parent constructor for room structure
        super(name, wall1, wall2, wall3, wall4, ceiling);

        // Initialize bedroom-specific furniture
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public void setupBedroom() {
        System.out.println("Setting up bedroom: " + getName());

        // Setup room structure (inherited from Room)
        getWall1().create();
        getWall2().create();
        getWall3().create();
        getWall4().create();
        getCeiling().create();

        // Setup bedroom furniture
        bed.make();
        lamp.turnOn();
        wardrobe.add();
        carpet.lying();

        System.out.println("Bedroom setup complete!");
    }

    @Override
    public void displayRoomInfo() {
        super.displayRoomInfo(); // Display basic room info
        System.out.println("--- Bedroom Furniture ---");
        System.out.println("Bed pillows: " + bed.getPillows());
        System.out.println("Lamp style: " + lamp.getStyle());
        System.out.println("Wardrobe size: " + wardrobe.getWidth() + "x" + wardrobe.getHeight());
        System.out.println("Carpet color: " + carpet.getColor());
    }
}