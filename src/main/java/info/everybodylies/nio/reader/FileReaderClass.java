package info.everybodylies.nio.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static info.everybodylies.nio.FileHelper.file;
import static info.everybodylies.nio.FileHelper.format;

public class FileReaderClass {

    public static void main(String[] args) {
        readIntoBuffer(getFileReader());
        readChars(getFileReader());
    }

    private static void readChars(FileReader fileReader) {
        int ch;
        try {
            while((ch = fileReader.read()) != -1) {
                format("Прочитан символ: %c", ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        closeFileReader(fileReader);
    }


    private static void readIntoBuffer(FileReader fileReader) {
        if (fileReader == null) {
            return;
        }
        char[] buffer = new char[100];
        try {
            format("Чтение [ %s ] из файла %s по 100 символов", "fileReader.read(buffer)", file);
            int readed;
            while ((readed = fileReader.read(buffer)) != -1) {
                format("прочитано %d символов", readed);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            closeFileReader(fileReader);
        }
    }

    private static FileReader getFileReader() {
        FileReader fileReader;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        return fileReader;
    }

    private static void closeFileReader(FileReader fileReader) {
        try {
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
