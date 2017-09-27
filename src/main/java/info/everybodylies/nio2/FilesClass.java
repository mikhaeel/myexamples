package info.everybodylies.nio2;

import com.sun.nio.file.ExtendedCopyOption;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

import static info.everybodylies.nio.FileHelper.format;

public class FilesClass {

    public static void main(String[] args) {
        Path filePath = Paths.get("h:\\ocpjp\\pathFile.txt");
        Path filePathCopy = Paths.get("h:\\ocpjp\\pathFileCopy.txt");
        Path filePathMove = Paths.get("h:\\ocpjp\\pathFileMove.txt");
        Path dirPath = Paths.get("h:\\ocpjp\\dirFile");
        Path manydirPath = Paths.get("h:\\ocpjp\\dirFile\\one\\two\\three");

        try {

            /**
             * Удаление файлов если они существуют
             */
            format("Files.deleteIfExists(filePath): %s", Files.deleteIfExists(filePath));
            format("Files.deleteIfExists(filePath): %s", Files.deleteIfExists(dirPath));

            /**
             * создание файлов
             */
            format("Files.createFile(filePath): %s", Files.createFile(filePath));
            format("Files.createDirectory(dirPath): %s", Files.createDirectory(dirPath));
            //format("Files.createDirectories(manydirPath): %s", Files.createDirectories(manydirPath));

            /**
             * Копирование файлов
             */
            Path copyResult = Files.copy(filePath, filePathCopy, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
            format("Files.copy(filePath, filePathCopy): %s", copyResult);

            /**
             * Стандартные аттрибуты копирования
             */
            for (CopyOption copyOption : StandardCopyOption.values()) {
                format("StandardCopyOption: %s", copyOption);
            }

            /**
             * Расширенные аттрибуты копирования
             */
            for (CopyOption copyOption : ExtendedCopyOption.values()) {
                format("ExtendedCopyOption: %s", copyOption);
            }

            /**
             * Перемещение файла
             */
            Files.move(filePathCopy, filePathMove, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * Удаление файла и повторное удаление уже удалённого
         */
        try {
            format("Files.delete(filePathMove) return void"); Files.delete(filePathMove);
            format("Удаляем уже удалённый Files.delete(filePathMove): return void"); Files.delete(filePathMove);
        } catch (IOException e) {
            format("%s", e);
        }

        /**
         * LinkOptions
         */
        for (LinkOption linkOption : LinkOption.values()) {
            format("LinkOption: %s", linkOption);
        }

        /**
         * Проверка что файл существует
         */
        format("Files.exists(filePath): %s", Files.exists(filePath));
        format("Files.exists(filePath, LinkOption.NOFOLLOW_LINKS): %s", Files.exists(filePath, LinkOption.NOFOLLOW_LINKS));

        /**
         * проверка что файл не существует
         */
        format("Files.notExists(filePathMove): %s", Files.notExists(filePathMove));
        format("Files.notExists(filePathMove, LinkOption.NOFOLLOW_LINKS): %s", Files.notExists(filePathMove, LinkOption.NOFOLLOW_LINKS));
    }
}
