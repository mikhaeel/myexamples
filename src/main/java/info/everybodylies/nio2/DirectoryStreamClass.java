package info.everybodylies.nio2;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static info.everybodylies.nio.FileHelper.format;

public class DirectoryStreamClass {

    public static void main(String[] args) {
        Path path = Paths.get("c:\\windows");

        /**
         * Прохождение по всему содержимому указанного path без фильтрации
         */
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
            for (Path p : directoryStream) {
                format("%s %s", p, new DosAttributesFormat(p));
            }
        } catch (IOException e) {
            format("%s", e);
        }
        format("");

        /**
         * Прохождение по всему содержимому указанного path с использованием GLOB
         */
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path, "*.{log,exe}")) {
            for(Path p : directoryStream) {
                format("%s", p);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
