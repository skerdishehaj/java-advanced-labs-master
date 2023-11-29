package lab1.directories.ush1;

import java.io.File;

/**
 * Write a program that lists all the subdirectories of a given directory.
 */
public class ListSubDirectories {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\skerd\\Desktop\\Master Profesional\\Java Advanced\\Labs\\src\\lab1\\assets";
        listSubDirectories(directoryPath, 0);
    }

    public static void listSubDirectories(String directoryPath, int indentLevel) {
        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Directory does not exist.");
            return;
        }
        for (File file : directory.listFiles()) {
            if (file.isDirectory()) {
                for (int i = 0; i < indentLevel; i++) {
                    System.out.print("----");
                }
                System.out.println(file.getName());
                listSubDirectories(file.getAbsolutePath(), indentLevel + 1);
            }
        }
    }
}
