package lab1.files.ush5;

import java.io.File;

/**
 * Implement a file search functionality that searches for a specific file by name in a directory and its subdirectories.
 */
public class Main {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\skerd\\Desktop\\Master Profesional\\Java Advanced\\Labs\\Lab1";
        String fileName = "file3.txt";
        searchFile(directoryPath, fileName);
    }

    public static void searchFile(String directoryPath, String fileName) {
        File directory = new File(directoryPath);

        if (!directory.isDirectory()) {
            System.out.println("Nuk u gjet direktoria");
            return;
        }

        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().equals(fileName)) {
                    System.out.println("U gjet: " + file.getAbsolutePath());
                }
            }
        }
    }
}