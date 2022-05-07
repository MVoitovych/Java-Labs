package ua.lviv.iot.lab7;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExtensionsFinderTest {

    @Test
    void findImages() {
        String[] expected = {"word.jpg", "word.jpeg", "word.gif", "word.bmp", "word.png"};
        ExtensionsFinder finder = new ExtensionsFinder();
        List<String> filesList = finder.findFilesForExtensions("word.jpg wedfdv word.jpeg word.gif 3wefrvde.txt egrfwd.word word.bmp word.png, word1.jpg",
                "word", "(jpg|jpeg|gif|bmp|png)");
        try {
            for (int i = 0; i < expected.length; i++) {
                assertEquals(expected[i], filesList.get(i));
                System.out.println(filesList.get(i));
            }
        } catch (Exception e) {
            System.out.println("Exeption: " + e);
        }
    }
}