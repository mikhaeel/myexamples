package info.everybodylies.nio2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

import static info.everybodylies.nio.FileHelper.format;

public class PathMatcherClass {

    public static void main(String[] args) {
        {
            Path path = Paths.get("h:\\ocpjp\\andotherDirectory\\pathFile.txt");
            PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:*/.txt");
            format("pathMatcher.matches(path) -> %s", pathMatcher.matches(path));
        }
        {
            Path path = Paths.get("h:/ocpjp/aa/pathFile.txt");
            format("Files.exists(path) -> %s", Files.exists(path));
            String syntaxAndPattern = "glob:**/*.txt";
            PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(syntaxAndPattern);
            format("%s matches %s -> %s", path, syntaxAndPattern, pathMatcher.matches(path));
        }

    }
}
