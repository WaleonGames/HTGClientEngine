package pl.htgmc.custom;

import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class HTGClientEngine {

    private static final String BLOCKS_PACKAGE = "pl.htgmc.custom.blocks";  // Pakiet, w którym znajdują się klasy bloków

    // Lista zarejestrowanych bloków
    private static final List<Block> registeredBlocks = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Uruchamianie HTGClientEngine...");

        // Rejestracja wszystkich bloków
        registerAllBlocks();

        // Wydrukuj zarejestrowane bloki
        for (Block block : registeredBlocks) {
            System.out.println("Zarejestrowano blok: " + block.getName() + " ID: " + block.getId());
        }

        // Inne działania...
    }

    public static void registerAllBlocks() {
        try {
            // Ścieżka do pakietu z klasami
            File dir = new File(ClassLoader.getSystemResource(BLOCKS_PACKAGE.replace('.', '/')).getFile());

            // Lista wszystkich plików w katalogu (klas)
            String[] files = dir.list();

            if (files != null) {
                for (String fileName : files) {
                    // Sprawdzanie, czy plik to klasa
                    if (fileName.endsWith(".class")) {
                        String className = BLOCKS_PACKAGE + "." + fileName.substring(0, fileName.length() - 6);
                        try {
                            // Załaduj klasę
                            Class<?> clazz = Class.forName(className);
                            // Sprawdź, czy klasa rozszerza Block
                            if (Block.class.isAssignableFrom(clazz)) {
                                // Użyj konstruktora z parametrami (np. "Dirt", 1)
                                Constructor<?> constructor = clazz.getConstructor(String.class, int.class);

                                // Tutaj zakładam, że nazwa i ID są poprawnie przekazywane do konstruktorów
                                Block block = (Block) constructor.newInstance("Dirt", 1);  // Przekazanie parametrów
                                registeredBlocks.add(block);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();  // Usuwamy IOException, bo tu używamy ogólnego wyjątku
        }
    }
}
