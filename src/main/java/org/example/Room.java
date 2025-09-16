// org/example/model/Room.java
// BONUS - For Challengers
package org.example.model;

public class Room {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;

    public Room(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
    }

    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public void displayRoomInfo() {
        System.out.println("Room: " + name);
        System.out.println("Walls: " + wall1.getDirection() + ", " + wall2.getDirection() +
                ", " + wall3.getDirection() + ", " + wall4.getDirection());
        System.out.println("Ceiling height: " + ceiling.getHeight() +
                ", Color: " + ceiling.getColor());
    }
}