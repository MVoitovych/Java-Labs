package ua.lviv.iot.lab2.lab6.writer;

import ua.lviv.iot.lab2.models.AbstractFishingTackle;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@edu.umd.cs.findbugs.annotations.SuppressFBWarnings("DM_DEFAULT_ENCODING")
public class FishingTackleWriter {

    public void writeToFile(List<AbstractFishingTackle> tackle, String fileName) {
        if (!tackle.isEmpty()) {
            try {
                File file = new File(fileName);
                if (!file.exists()) {
                    if (file.createNewFile()) {
                        PrintWriter pw = new PrintWriter(file);
                        tackle.forEach(tac -> {
                            pw.println(tac.getHeaders());
                            pw.println(tac.toCSV());
                        });
                        pw.close();
                    }
                }
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }
}

