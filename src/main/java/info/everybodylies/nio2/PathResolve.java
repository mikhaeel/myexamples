package info.everybodylies.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

import static info.everybodylies.nio.FileHelper.format;

public class PathResolve {

    public static void main(String[] args) {
        Path absolute = Paths.get("/home/java");
        Path relative = Paths.get("dir");
        Path file = Paths.get("Model.pdf");
        format("absolute: %s", absolute);
        format("relative: %s", relative);
        format("file: %s", file);
        format("1: absolute.resolve(relative): %s", absolute.resolve(relative));
        format("2: absolute.resolve(file):     %s", absolute.resolve(file));
        format("3: relative.resolve(file):     %s", relative.resolve(file));
        format("4: relative.resolve(absolute) [BAD]: %s", relative.resolve(absolute)); // BAD
        format("5: file.resolve(absolute)     [BAD]: %s", file.resolve(absolute)); // BAD
        format("6: file.resolve(relative)     [BAD]: %s", file.resolve(relative)); // BAD
        format("7: file.resolve(file)         [BAD]: %s", file.resolve(file)); // BAD

        format("absolute.resolve(string): %s", absolute.resolve("333"));
        //format("absolute.resolve(string): %s", absolute.resolve(null)); - AMBIGOUS ARGUMENT
        //format("absolute.resolve(string): %s", absolute.resolve((Path)null)); - POSSIBLE, BUT NPE
    }
}
