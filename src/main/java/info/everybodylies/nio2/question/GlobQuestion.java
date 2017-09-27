package info.everybodylies.nio2.question;

import java.nio.file.*;

import static info.everybodylies.nio.FileHelper.format;

public class GlobQuestion {

    public static void main(String[] args) {
        Path a = Paths.get("c:/temp/dir/a.txt");
        Path b = Paths.get("c:/temp/dir/subdir/b.txt");

        PathMatcher[] matchers = {
                FileSystems.getDefault().getPathMatcher("glob:*/*.txt"),
                FileSystems.getDefault().getPathMatcher("glob:**.txt"),
                FileSystems.getDefault().getPathMatcher("glob:*.txt"),
                FileSystems.getDefault().getPathMatcher("glob:/*/*.txt"),
                FileSystems.getDefault().getPathMatcher("glob:/**.txt"),
                FileSystems.getDefault().getPathMatcher("glob:/*.txt")
        };

        for(PathMatcher m : matchers) {
            format("m.matches(a) -> %s", m.matches(a));
            format("m.matches(b) -> %s", m.matches(b));
            format("");
        }
    }
}
