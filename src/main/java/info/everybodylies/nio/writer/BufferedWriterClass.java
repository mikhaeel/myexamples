package info.everybodylies.nio.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static info.everybodylies.nio.FileHelper.*;

public class BufferedWriterClass {

    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        //Все методы класса BufferedWriter точно такие же как и в классе Writer
        try {
            format("Вызов метода write приводит к созданию нового файла или к перезаписи содержимого существующего");
            bufferedWriter.write("Строка запискана с помощью BufferedWriter");
            format("Пишем в файл: [ bufferedWriter.write(\"Строка запискана с помощью BufferedWriter\") ]");
            bufferedWriter.newLine();
            format("Перенос строки: [ bufferedWriter.newLine() ]");
            bufferedWriter.flush();
            format("Сброс содержимого на диск: [ bufferedWriter.flush() ]");
        } catch (IOException e) {
            try {
                bufferedWriter.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}
