package lab1.files.ush4;

import java.io.File;

/**
 * Develop a program that prints the directory tree structure for a given directory. Include subdirectories and files.
 */
public class DirectoryTree {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\skerd\\Desktop\\Master Profesional\\Java Advanced\\Labs\\src\\lab1\\assets";
        printDirectoryTree(directoryPath, 0);
    }
    public static void printDirectoryTree(String directoryPath, int indentLevel) {
        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Directory does not exist.");
            return;
        }

        // Printing the directory tree with proper indentation
        for (File file : directory.listFiles()) {
            for (int i = 0; i < indentLevel; i++) {
                System.out.print("\t");
            }
            System.out.println(file.getName());
            if (file.isDirectory()) {
                printDirectoryTree(file.getAbsolutePath(), indentLevel + 1);
            }
        }


    }

}
