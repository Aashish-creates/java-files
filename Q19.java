import java.io.*;

public class Q19{
    public static void main(String[] args) {
        String sourceFilePath = "source.txt";
        String destinationFilePath = "destination.txt";

        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(sourceFilePath));
             OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destinationFilePath))) {

            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }

            System.out.println("File copy completed successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during file copy: " + e.getMessage());
        }
    }
}

