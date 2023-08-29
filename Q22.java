import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        String filePath = "output.txt";

        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            writer.write(name);

            System.out.println("");
        } catch (IOException e) {
            System.out.println(" " + e.getMessage());
        }
    }
}
