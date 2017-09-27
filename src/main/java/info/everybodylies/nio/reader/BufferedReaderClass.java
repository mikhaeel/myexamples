package info.everybodylies.nio.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static info.everybodylies.nio.FileHelper.*;

public class BufferedReaderClass {

    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                format("Чтение построчно [ bufferedReader.readLine() ], прочитано: %s", line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
