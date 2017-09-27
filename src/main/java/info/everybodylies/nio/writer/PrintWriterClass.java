package info.everybodylies.nio.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static info.everybodylies.nio.FileHelper.*;

public class PrintWriterClass {

    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
             fileWriter = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        PrintWriter printWriter = new PrintWriter(fileWriter);
        //Все методы класса BufferedWriter точно такие же как и в классе Writer
        printWriter.format("Запись форматированной строки в файл методом format%n" +
                "%%d = %d, %%b = %b, %%f = %f, %%s = %s, %%c = %c %n", 10L, true, 10.0d, "строка", '\u02FF');
        printWriter.printf("Запись форматированной строки в файл методом printf%n" +
                "%%d = %d, %%b = %b, %%f = %f, %%s = %s, %%c = %c %n", 10L, true, 10.0d, "строка", '\u02FF');
        printWriter.print(true);
        printWriter.println();
        printWriter.print('\u003F');
        printWriter.println();
        printWriter.print(100000);
        printWriter.println();
        printWriter.print(100000000000000000L);
        printWriter.println();
        printWriter.print(100000f);
        printWriter.println();
        printWriter.print(100000d);
        printWriter.println();
        printWriter.print(new char[] {'1', '2', '3'});
        printWriter.println();
        printWriter.print("Строка");
        printWriter.println();
        printWriter.print(printWriter);
        printWriter.println();
        printWriter.append('\u10FF');
        printWriter.println();
        printWriter.append("sdsdf", 0, 2);
        printWriter.flush();
        printWriter.close(); // Закроет и writer и будет exception
        try {
            fileWriter.write("1");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
