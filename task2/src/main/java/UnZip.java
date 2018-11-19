import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZip {


    public static void main(String[] args) {
        UnZip app = new UnZip();
        app.unZip("C:\\Users\\Админ\\Downloads\\zip.zip", "C:\\Users\\Админ\\Downloads");
    }


    public void unZip(String zipFile, String outputFolder) {
        byte[] buffer = new byte[1024];

        try {
             ZipInputStream zipInputStream = new ZipInputStream(
                    new FileInputStream(zipFile));
            ZipEntry zipEntry = zipInputStream.getNextEntry();
            while (zipEntry != null) {
                String nextFileName = zipEntry.getName();
                File nextFile = new File(outputFolder + File.separator + nextFileName);

                if (zipEntry.isDirectory()) {
                    nextFile.mkdir();
                } else {
                    new File(nextFile.getParent()).mkdirs();
                    try (FileOutputStream fileOutputStream
                                 = new FileOutputStream(nextFile)) {
                        int length = zipInputStream.read(buffer);
                        while (length > 0) {
                            fileOutputStream.write(buffer, 0, length);
                        }
                    }
                }
                zipEntry = zipInputStream.getNextEntry();
            }
            zipInputStream.closeEntry();
            zipInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.print(e);
        } catch (IOException e) {
            System.out.print(e);
        }

    }
}


