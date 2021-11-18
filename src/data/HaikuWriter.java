package data;

import haikuanalysis.HaikuPoem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HaikuWriter {

    //Creating storage for correct poems
    public void haikuStorage(HaikuPoem poem) {
        try {
            File file = new File("HaikuStorage/haikustorage.txt");
            FileWriter filewriter = new FileWriter(file, true);
            filewriter.write(poem + "\n");
            filewriter.close();

        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
