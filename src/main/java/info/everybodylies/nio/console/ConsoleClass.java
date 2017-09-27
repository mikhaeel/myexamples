package info.everybodylies.nio.console;

import java.io.Console;
import java.io.IOException;

import static info.everybodylies.nio.FileHelper.format;

public class ConsoleClass {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            console.format("Введите пароль: %n");
            String readedLine = console.readLine("Нет, вот теперь вводите %s: ", "пароль");
            format("Прочитанная из консоли строка [%s]", readedLine);
            char[] password = console.readPassword("Вот тут уже точно надо ввести пароль: ");
            for (char ch : password) {
                format("символ пароля: %c", ch);
            }
            try {
                int ch = console.reader().read();
                format("прочитан символ [%c]", ch);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    console.reader().close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            format("программа запущена не с консоли!!!!");
        }
    }
}
