package info.everybodylies.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

import static info.everybodylies.nio.FileHelper.format;

public class PathNormalize {

    public static void main(String[] args) {

        /**
         * Нормализация пути
         */
        Path[] paths = {
                Paths.get("h:\\", "ocpjp", "file.txt"),
                Paths.get("h:\\", ".", "file.txt"),
                Paths.get("h:\\", "..", "file.txt"),
                Paths.get("h:\\", "ocpjp", "somedir", "..", "file.txt"),
                Paths.get("h:\\", "ocpjp", ".", "..", "..", "..", "..", "file.txt"),
                Paths.get("ocpjp", ".", "..", "..", "..", "..", "file.txt"),
                Paths.get("/.", "file.txt"),
                Paths.get("..", "file.txt"),
                Paths.get("../a/b/c")
        };
        for (Path path : paths) {
            format("До нормализации: %s%nПосле нормализации: %s%n", path, path.normalize());
        }
    }
}
