package info.everybodylies.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.concurrent.TimeUnit;

import static info.everybodylies.nio.FileHelper.format;

public class BasicFileAttributeClass {

    public static void main(String[] args) {
        Path path = Paths.get("h:\\ocpjp", "pathFile.txt");

        /**
         * Чтение BasicFileAttribute
         */
        try {
            BasicFileAttributes basicFileAttribute = Files.readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            format("[%s] basicFileAttribute.creationTime() -> %s", path, basicFileAttribute.creationTime());
            format("[%s] basicFileAttribute.fileKey() -> %s", path, basicFileAttribute.fileKey());
            format("[%s] basicFileAttribute.isDirectory() -> %s", path, basicFileAttribute.isDirectory());
            format("[%s] basicFileAttribute.isOther() -> %s", path, basicFileAttribute.isOther());
            format("[%s] basicFileAttribute.isRegularFile() -> %s", path, basicFileAttribute.isRegularFile());
            format("[%s] basicFileAttribute.isSymbolicLink() -> %s", path, basicFileAttribute.isSymbolicLink());
            format("[%s] basicFileAttribute.lastAccessTime() -> %s", path, basicFileAttribute.lastAccessTime());
            format("[%s] basicFileAttribute.lastModifiedTime() -> %s", path, basicFileAttribute.lastModifiedTime());
            format("[%s] basicFileAttribute.size() -> %s", path, basicFileAttribute.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
        format("");

        /**
         * Запись BasicFileAttributes
         */
        BasicFileAttributeView basicAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class, LinkOption.NOFOLLOW_LINKS);
        format("basicAttributeView.name() -> %s", basicAttributeView.name());
        try {
            format("basicAttributeView.setTimes(FileTime.from(1000, TimeUnit.DAYS), FileTime.from(1500, TimeUnit.HOURS), FileTime.from(2000, TimeUnit.MINUTES))");
            basicAttributeView.setTimes(FileTime.from(1000, TimeUnit.DAYS), FileTime.from(1500, TimeUnit.HOURS), FileTime.from(2000, TimeUnit.MINUTES));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
