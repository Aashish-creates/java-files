import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q21 {
    public static void main(String[] args) {
        String filePath = "file.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

