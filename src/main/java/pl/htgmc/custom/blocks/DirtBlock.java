package pl.htgmc.custom.blocks;

import pl.htgmc.custom.Block;

public class DirtBlock extends Block {
    // Konstruktor, który pasuje do metody registerAllBlocks
    public DirtBlock(String name, int id) {
        super("dirt", 1);  // Wywołanie konstruktora nadrzędnej klasy Block
    }

    // Inne metody specyficzne dla DirtBlock
}
