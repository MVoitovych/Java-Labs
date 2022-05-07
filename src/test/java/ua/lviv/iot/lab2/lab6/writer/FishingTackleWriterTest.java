package ua.lviv.iot.lab2.lab6.writer;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab2.models.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SuppressFBWarnings("DM_DEFAULT_ENCODING")
class FishingTackleWriterTest {
    List<AbstractFishingTackle> createDifferentClassesList() {
        List<AbstractFishingTackle> objList = new LinkedList<>();
        objList.add(new FishingRod("Vudochka", 1200.001f, 1, TypeOfFishing.LAKE, 600, "Bamboo"));
        objList.add(new FishingReel("Zhylka", 1200.002f, 3, TypeOfFishing.LAKE, 50, 25));
        objList.add(new FishingWear("Gumaky", 300, 50, TypeOfFishing.RIVER, "Rubber", true));
        objList.add(new FishingBait("Chervyak", 2.5F, 500, TypeOfFishing.RIVER, true));
        return objList;
    }

    List<AbstractFishingTackle> createSameClassesList() {
        List<AbstractFishingTackle> objList = new LinkedList<>();
        objList.add(new FishingRod("Vudochka", 1200.001f, 1, TypeOfFishing.LAKE, 700, "Bamboo"));
        objList.add(new FishingRod("Vudochka2", 1200.1f, 1, TypeOfFishing.WINTER, 800, "Steel"));
        objList.add(new FishingRod("Vudochka3", 1200.2f, 1, TypeOfFishing.SEA, 100, "Rubber"));
        objList.add(new FishingRod("Vudochka4", 1200.3f, 1, TypeOfFishing.LAKE, 200, "Carbon"));
        return objList;
    }

    public static String sep = File.separator;

    @Test
    void writeDifferentClassesToFile() {
        try {
            Path expectedFilePath = Paths.get("src" + sep + "test" + sep + "resources" + sep + "expected0.CSV");
            String testedFileName = "differentClassesDataFile.CSV";
            FishingTackleWriter writer = new FishingTackleWriter();
            writer.writeToFile(createDifferentClassesList(), testedFileName);
            File expected = new File(String.valueOf(expectedFilePath));

            Assertions.assertTrue(expected.exists());

            BufferedReader testReader = new BufferedReader(new FileReader(expected));
            BufferedReader currentReader = new BufferedReader(new FileReader(testedFileName));

            String testLine;
            while ((testLine = testReader.readLine()) != null) {
                Assertions.assertEquals(testLine, currentReader.readLine());
            }
            System.out.println("files are same :)");
            testReader.close();
            currentReader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    @Test
    void writeSameClassesToFile() {
        Path expectedFilePath = Paths.get("src" + sep + "test" + sep + "resources" + sep + "expected1.CSV");
        try {
            String testedFileName = "sameClassesDataFile.CSV";
            FishingTackleWriter writer = new FishingTackleWriter();
            writer.writeToFile(createSameClassesList(), testedFileName);
            File expected = new File(String.valueOf(expectedFilePath));

            Assertions.assertTrue(expected.exists());

            BufferedReader testReader = new BufferedReader(new FileReader(expected));
            BufferedReader currentReader = new BufferedReader(new FileReader(testedFileName));

            String testLine;
            while ((testLine = testReader.readLine()) != null) {
                Assertions.assertEquals(testLine, currentReader.readLine());
            }
            System.out.println("files are same :)");
            testReader.close();
            currentReader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }


    @Test
    void writeEmptyListToFile() {
        try {
            String testedFileName = "emptyClassesDataFile.CSV";

            FishingTackleWriter writer = new FishingTackleWriter();
            writer.writeToFile(new ArrayList<AbstractFishingTackle>(), testedFileName);
            File expected = new File(testedFileName);

            Assertions.assertFalse(expected.exists());

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println("no files created :)");

    }
}
