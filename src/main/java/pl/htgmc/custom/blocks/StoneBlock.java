package pl.htgmc.custom.blocks;

import pl.htgmc.custom.Block;

import java.awt.*;

public class StoneBlock extends Block {
    // Konstruktor, który pasuje do metody registerAllBlocks
    public StoneBlock(String name, int id) {
        super("stone", 3, new Color(87, 166, 57));  // Wywołanie konstruktora nadrzędnej klasy Block
    }

    // Inne metody specyficzne dla DirtBlock
}
