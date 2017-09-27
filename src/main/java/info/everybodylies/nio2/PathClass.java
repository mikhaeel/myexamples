package info.everybodylies.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

import static info.everybodylies.nio.FileHelper.format;

public class PathClass {

    public static void main(String[] args) {
        Path path = Paths.get("h:\\", "ocpjp", "path.txt");
        Path relativePath = Paths.get("ocpjp\\111");
        format("[%-20s]: %s", "path.toUri() ", path.toUri());
        format("[%-20s]: %s", "path.getFileName()", path.getFileName());
        for (int i = 0; i < path.getNameCount(); i++) {
            format("path.getName(%d): %s", i, path.getName(i));
        }
        format("path.getRoot(): %s", path.getRoot());
        getParent(path);
        format("path.isAbsolute(): %s", path.isAbsolute());
        format("path.startsWith(Paths.get(\"h:\\\\\")): %s", path.startsWith(Paths.get("h:\\")));
        format("path.subpath(0, 1): %s", path.subpath(0, 1));
        format("path.subpath(1, 2): %s", path.subpath(1, 2));
        //format("path.subpath(2, 3): %s", path.subpath(2, 3)); - EXCEPTION
        format("relativePath.toAbsolutePath(): %s", relativePath.toAbsolutePath());
    }

    private static void getParent(Path path) {
        Path parent = path.getParent();
        if (parent != null) {
            format("path.getParent() of %s return %s", path, parent);
            getParent(parent);
        }
    }
}
