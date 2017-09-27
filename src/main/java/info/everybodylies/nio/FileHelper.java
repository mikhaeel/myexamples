package info.everybodylies.nio;

import java.io.File;

import static java.lang.System.out;

public class FileHelper {

    public static final File directory = new File("h:\\ocpjp");
    public static final File file = new File(directory, "fileWriter.txt");

    public static void deleteFileIfExists() {
        if (file.exists()) {
            out.format("Файл %s существует? (%b). Удаляем:(%b)%n", file, file.exists(), file.delete());
        }
    }

    public static void format(String format, Object... args) {
        System.out.format(format + "%n", args);
    }

}
