package info.everybodylies.nio.file;

import static java.lang.System.out;

import java.io.File;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) {

        /**
         * конструкторы класса File
         */
        File myFile = new File("h:\\ocpjp\\fullPath.txt");
        File directory = new File("h:\\", "ocpjp");
        File myFile3 = new File(directory, "myFile.txt");

        /**
         * Создание файла
         */
        try {
            out.println("1) Создаём новый файл " + myFile + " командой [ createNewFile() ]. Результат " + myFile.createNewFile());
            out.println("2) Повторно вызываем тот же метод: [ myFile.createNewFile() ]. Результат: " + myFile.createNewFile());
            out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * Проверка существования файла exists()
         */
        out.println("1) Проверка существования файла: " + myFile + " [ myFile.exists() ] : " + myFile.exists());
        out.println();

        /**
         * Проверка является ли класс файл директорией
         */
        out.println("1) Является ли файл " + myFile + " дирекрторией? " + myFile.isDirectory());
        out.println("4) Является ли файл " + directory + " дирекрторией? " + directory.isDirectory());
        out.println("3) Является ли файл " + myFile3 + " дирекрторией? " + myFile3.isDirectory());
        out.println();

        /**
         * Проверка является ли класс File классом
         */
        out.println("1) Является ли файл " + myFile + " обычным файлом? " + myFile.isFile());
        out.println("4) Является ли файл " + directory + " обычным файлом? " + directory.isFile());
        out.println("3) Является ли файл " + myFile3 + " обычным файлом? " + myFile3.isFile());
        out.println();

        /**
         * Удаление файла
         */
        out.println("1) Удаляем файл " + myFile + " [ myFile.delete() ] Результат: " + myFile.delete());
        out.println("2) Повторно удаляем файл " + myFile + " [ myFile.delete() ] Результат: " + myFile.delete());
        out.println();

        /**
         * создание директорий
         */
        File dirToCreate = new File(directory, "createdDir");
        if (dirToCreate.exists()) {
            out.println("Директория " + dirToCreate + " существует, удаляем dirToCreate.delete(): " + dirToCreate.delete());
        }
        out.println("Создание новой директории " + dirToCreate + ": " + dirToCreate.mkdir());
        out.println();

        /**
         * Переименование файла/директории
         */
        // file.rename(File filename) - метод принимает на вход File!!!
        // dirToCreate.renameTo("renamedDirectory");
        out.println("Переименование директории directory.renameTo(new File(\"renamedDirectory\")): " + directory.renameTo(new File("renamedDirectory")));

        /**
         * Просмотр содержимого папки
         */
        out.println("Просмотр содержимого католога " + directory);
        String[] filenames = directory.list();
        for (String fileName : filenames) {
            out.println(fileName);
        }

    }
}

