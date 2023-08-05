package src.test.java.dev.cln89.totp2;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOUtils {

    /**
     * Helper method to write data to a file.
     */
    public static void writeFile(byte[] contents, String filePath) throws IOException {
        try (FileOutputStream stream = new FileOutputStream(filePath)) {
            stream.write(contents);
        }
    }
}
