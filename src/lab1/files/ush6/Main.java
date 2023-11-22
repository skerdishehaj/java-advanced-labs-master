package lab1.files.ush6;

import java.io.File;

/**
 * Write a program that deletes a specified file. Ensure that the program checks if the file exists before attempting to delete it.​
 */
public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\skerd\\Desktop\\Master Profesional\\Java Advanced\\Labs\\Lab1\\assets\\file2.txt";
        deleteFile(filePath);
    }

    public static void deleteFile(String filePath) {
        File fileToDelete = new File(filePath);

        if (fileToDelete.exists() && fileToDelete.isFile()) {
                if (fileToDelete.delete()) {
                    System.out.println("U fshi: " + filePath);
                } else {
                    System.out.println("Nuk u fshi: " + filePath);
                }
        } else {
            System.out.println("Nuk u gjet: " + filePath);
        }
    }
}