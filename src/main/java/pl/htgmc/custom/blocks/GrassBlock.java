package pl.htgmc.custom.blocks;

import pl.htgmc.custom.Block;

public class GrassBlock extends Block {
    // Konstruktor, który pasuje do metody registerAllBlocks
    public GrassBlock(String name, int id) {
        super("grass", 2);  // Wywołanie konstruktora nadrzędnej klasy Block
    }

    // Inne metody specyficzne dla DirtBlock
}
