import java.io.*;
import java.nio.file.*;

public class FileUtility {

    // Read the content of a file
    public static String readFile(String filePath) throws IOException {
        return Files.readString(Paths.get(filePath));
    }

    // Write content to a file (overwrite)
    public static void writeFile(String filePath, String content) throws IOException {
        Files.writeString(Paths.get(filePath), content);
    }

    // Append content to a file
    public static void appendToFile(String filePath, String content) throws IOException {
        Files.writeString(Paths.get(filePath), content, StandardOpenOption.APPEND);
    }

    // Replace a word or sentence in the file
    public static void modifyFile(String filePath, String target, String replacement) throws IOException {
        String content = readFile(filePath);
        content = content.replace(target, replacement);
        writeFile(filePath, content);  // overwrite with modified content
    }
}

