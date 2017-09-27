package info.everybodylies.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

import static info.everybodylies.nio.FileHelper.format;

public class PathRelativize {

    public static void main(String[] args) {
        Path absolute1 = Paths.get("/home/java");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("/home/java/temp/music.mp3");
        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/music.pdf");
        format("absolute1.relativize(absolute3) [%s -> %s] %s", absolute1, absolute3, absolute1.relativize(absolute3));
        format("absolute3.relativize(absolute1) [%s -> %s] %s", absolute3, absolute1, absolute3.relativize(absolute1));
        format("absolute1.relativize(absolute2) [%s -> %s] %s", absolute1, absolute2, absolute1.relativize(absolute2));
        format("relative1.relativize(relative2) [%s -> %s] %s", relative1, relative2, relative1.relativize(relative2));
        format("relative2.relativize(relative1) [%s -> %s] %s", relative2, relative1, relative2.relativize(relative1));
        try {
            format("absolute1.relativize(relative1): %s", absolute1.relativize(relative1));
        } catch (Exception e) {
            format("%s", e);
        }
    }
}
