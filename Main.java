import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "sample.txt";

        try {
            // Write to file
            FileUtility.writeFile(filePath, "Hello, this is a file handling test.\n");

            // Append to file
            FileUtility.appendToFile(filePath, "Appending a second line.\n");

            // Modify file content
            FileUtility.modifyFile(filePath, "file handling", "Java file handling");

            // Read and print file content
            String content = FileUtility.readFile(filePath);
            System.out.println("Final File Content:\n" + content);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
