package lab1.directories.ush2;

import java.io.File;

/**
 * - Create a program that calculates and prints the total size of a directory (including all files and subdirectories).
 */
public class DirectorySize {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\skerd\\Desktop\\Master Profesional\\Java Advanced\\Labs\\src\\lab1\\assets";
        System.out.println("Total size: " + getDirectorySize(directoryPath) + " bytes");
    }
    public static double getDirectorySize(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Directory does not exist.");
            return 0;
        }
        double size = 0;
        for (File file : directory.listFiles()) {
            if (file.isFile()) {
                size += file.length();
            } else {
                size += getDirectorySize(file.getAbsolutePath());
            }
        }
        return size;
    }
}
