package info.everybodylies.nio.writer;

import java.io.FileWriter;
import java.io.IOException;

import static info.everybodylies.nio.FileHelper.*;

public class FileWriterClass {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("строка\n"); // Первый вызов на несуществующем файле создаст его
            format("Вызываем [ fileWriter.write(\"строка\\n\") ]. Файл создался? (%b)", file.exists());
            fileWriter.write("длинная строка", 3, 7);
            fileWriter.write(new char[] {'\n'});
            format("Записываем: [ fileWriter.write(\"длинная строка\", 3, 7) ]");
            char[] cbuf = { 'с', 'л', 'о', 'в', 'о', '\n'};
            fileWriter.write(cbuf);
            format("Записываем: [ fileWriter.write(new char[] {'\\n', 'с', 'л', 'л', 'в', 'о'}) ]");
            fileWriter.write(cbuf, 0, 3);
            fileWriter.write(new char[] {'\n'});
            format("Записываем: [ fileWriter.write(cbuf, 0, 3) ]");
            fileWriter.write(300);
            format("Записываем: [ fileWriter.write(300) ]");

            fileWriter.flush();
            format("Вызываем flush() [ fileWriter.flush() ]");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                    format("Закрываем файл [ fileWriter.close() ]");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
