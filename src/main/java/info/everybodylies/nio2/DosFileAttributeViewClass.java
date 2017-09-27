package info.everybodylies.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileTime;
import java.util.concurrent.TimeUnit;

import static info.everybodylies.nio.FileHelper.format;

public class DosFileAttributeViewClass {

    public static void main(String[] args) {
        Path path = Paths.get("h:\\ocpjp", "pathFile.txt");

        DosFileAttributeView dosAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        format("dosAttributeView.readAttributes() %s", dosAttributeView.name());
        try {
            dosAttributeView.setArchive(true);
            dosAttributeView.setHidden(true);
            dosAttributeView.setReadOnly(true);
            dosAttributeView.setSystem(true);
            dosAttributeView.setTimes(FileTime.from(1000, TimeUnit.HOURS), null, null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.setAttribute(path, "dos:archive", false);
            Files.setAttribute(path, "dos:hidden", false);
            Files.setAttribute(path, "dos:readonly", false);
            Files.setAttribute(path, "dos:system", false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
