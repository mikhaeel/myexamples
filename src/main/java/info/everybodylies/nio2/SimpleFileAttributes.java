package info.everybodylies.nio2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.concurrent.TimeUnit;

import static info.everybodylies.nio.FileHelper.format;

public class SimpleFileAttributes {

    public static void main(String[] args) {
        /**
         * Чтение аттрибутов с помощью класса File
         */
        File file = new File("h:\\ocpjp", "pathFile.txt");
        format("[%s] file.canRead() -> %s", file, file.canRead());
        format("[%s] file.canWrite() -> %s", file,  file.canWrite());
        format("[%s] file.canExecute() -> %s", file, file.canExecute());
        format("[%s] file.isHidden() -> %s", file, file.isHidden());
        format("[%s] file.lastModified() -> %s", file, file.lastModified());
        format("");

        /**
         * Чтение аттрибутов с помощью класса Files
         */
        Path path = Paths.get("h:\\", "ocpjp", "pathFile.txt");
        format("[%s] Files.isReadable(path) -> %s", path, Files.isReadable(path));
        format("[%s] Files.isWritable(path) -> %s", path, Files.isWritable(path));
        format("[%s] Files.isExecutable(path) -> %s", path, Files.isExecutable(path));
        try {
            format("[%s] Files.isHidden(path) -> %s", path, Files.isHidden(path));
            format("[%s] Files.isExecutable(path) -> %s", path, Files.getLastModifiedTime(path));
        } catch (IOException e) {
            format("%s", e);
        }
        format("");

        /**
         * Установка времени последней модификации файла для File и Path
         */
        format("file.setLastModified(10000L): %s", file.setLastModified(10000L));
        try {
            format("Files.setLastModifiedTime(path, FileTime.from(2000, TimeUnit.DAYS)): %s", Files.setLastModifiedTime(path, FileTime.from(2000, TimeUnit.DAYS)));
        } catch (IOException e) {
            format("%s", e);
        }

    }
}
