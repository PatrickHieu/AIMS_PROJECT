package hust.soict.hedspi.aims.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) throws Exception {
        // read Large File
        byte[] inputBytes = Files.readAllBytes(Paths.get("largefile.txt"));
        String outputStr = "";

        for (byte b : inputBytes) {
            outputStr += (char) b;
        }
        System.out.println("Created garbage!");
    }
}
