package lab1.files.ush3;

import java.io.*;

/**
 * Create a program that copies the contents of a file to another file.
 */
public class CopyFile {
    public static void main(String[] args) {
        // Specify the source and destination file paths
        String sourceFilePath = "C:\\Users\\skerd\\Desktop\\Master Profesional\\Java Advanced\\Labs\\src\\lab1\\assets\\testDir1\\file1.txt";
        String destinationFilePath = "C:\\Users\\skerd\\Desktop\\Master Profesional\\Java Advanced\\Labs\\src\\lab1\\assets\\testDir1\\file1-copy.txt";

        // Call the copyFile method to copy contents from source to destination
        copyFile(sourceFilePath, destinationFilePath);
    }

    // Method to copy contents from source file to destination file
    public static void copyFile(String sourceFilePath, String destinationFilePath) {
        // Create File objects for the source and destination files
        File sourceFile = new File(sourceFilePath);
        File destinationFile = new File(destinationFilePath);

        // Check if the source file exists and is a regular file
        if (!sourceFile.exists() || !sourceFile.isFile()) {
            System.out.println("The source file does not exist or is not a file");
            return;
        }

        // Create the destination file if it does not exist
        if (!destinationFile.exists()) {
            try {
                destinationFile.createNewFile();
                System.out.println("Destination file created");
            } catch (IOException e) {
                System.out.println("Could not create destination file");
                return;
            }
        }

        // Copy the contents of the source file to the destination file
        try (FileInputStream inStream = new FileInputStream(sourceFile);
             FileOutputStream outStream = new FileOutputStream(destinationFile)) {

            // Set up a buffer to hold the data during the copy process
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read from the input stream and write to the output stream until the end of file
            while ((bytesRead = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
