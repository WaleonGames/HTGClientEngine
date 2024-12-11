package pl.htgmc.custom;

import java.awt.Color;

public class Block {

    private String name;
    private int id;
    private Color color;  // Dodajemy pole do koloru

    // Konstruktor przyjmujący name, id i color
    public Block(String name, int id, Color color) {
        this.name = name;
        this.id = id;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Color getColor() {
        return color;
    }
}
