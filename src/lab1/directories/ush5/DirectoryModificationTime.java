package lab1.directories.ush5;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DirectoryModificationTime {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\skerd\\Desktop\\Master Profesional\\Java Advanced\\Labs\\Lab1\\assets\\testDir2";
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            long lastModifiedTime = directory.lastModified();

            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY HH:mm:ss");
            String formattedLastModifiedTime = sdf.format(new Date(lastModifiedTime));

            System.out.println("Modifikimi i fundit: " + formattedLastModifiedTime);
        } else {
            System.out.println("Direktoria nuk egziston");
        }
    }
}
