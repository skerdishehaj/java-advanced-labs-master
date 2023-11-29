package lab1.directories.ush3;

import java.io.File;

/**
 * Develop a program that recursively copies the contents of one directory to another.
 */
public class CopyDirectoryRecursively {
    public static void main(String[] args) {
        String sourceDirectoryPath = "C:\\Users\\skerd\\Desktop\\Master Profesional\\Java Advanced\\Labs\\src\\lab1\\assets";
        String destinationDirectoryPath = "C:\\Users\\skerd\\Desktop\\Master Profesional\\Java Advanced\\Labs\\src\\lab1\\assets-copy";
        copyDirectoryRecursively(sourceDirectoryPath, destinationDirectoryPath);
    }

    public static void copyDirectoryRecursively(String sourceDirectoryPath, String destinationDirectoryPath) {
        File sourceDirectory = new File(sourceDirectoryPath);
        File destinationDirectory = new File(destinationDirectoryPath);
        if (!sourceDirectory.exists() || !sourceDirectory.isDirectory()) {
            System.out.println("Source directory does not exist.");
            return;
        }
        if (!destinationDirectory.exists()) {
            destinationDirectory.mkdir();
        }
        for (File file : sourceDirectory.listFiles()) {
            if (file.isFile()) {
                File destinationFile = new File(destinationDirectoryPath + "\\" + file.getName());
                if (!destinationFile.exists()) {
                    try {
                        destinationFile.createNewFile();
                    } catch (Exception e) {
                        System.out.println("Could not create file: " + destinationFile.getAbsolutePath());
                    }
                }
            } else {
                copyDirectoryRecursively(file.getAbsolutePath(), destinationDirectoryPath + "\\" + file.getName());
            }
        }
    }
}
