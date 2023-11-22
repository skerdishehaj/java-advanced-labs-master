package lab1.directories.ush4;

import java.io.File;

public class DeleteDirectory {

    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\skerd\\Desktop\\Master Profesional\\Java Advanced\\Labs\\Lab1\\assets\\testDir1";
        File directory = new File(directoryPath);

        if (directory.exists()) {
            if (deleteDirectory(directory)) {
                System.out.println("Direktoria u fshi!");
            } else {
                System.out.println("Direktoria nuk u fshi");
            }
        } else {
            System.out.println("Direktoria nuk ekziston");
        }
    }

    private static boolean deleteDirectory(File directory) {
        File[] dirContent = directory.listFiles();

        if (dirContent != null) {
            for (File file : dirContent) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    if (!file.delete()) {
                        System.err.println("Nuk fshi file: " + file.getAbsolutePath());
                        return false;
                    }
                }
            }
        }

        return directory.delete();
    }
}
