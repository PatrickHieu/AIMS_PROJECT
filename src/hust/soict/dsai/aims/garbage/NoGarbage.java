package hust.soict.dsai.aims.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) throws Exception {
        byte[] inputBytes = Files.readAllBytes(Paths.get("largefile.txt"));
        StringBuffer outputStrBuffer = new StringBuffer();

        // Improve by using StringBuffer
        for (byte b : inputBytes) {
            outputStrBuffer.append((char) b);
        }
        System.out.println("Completed! No garbage found");
    }
}
