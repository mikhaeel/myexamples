package info.everybodylies.nio2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

import static info.everybodylies.nio.FileHelper.format;

public class FileVisitorClass {

    public static void main(String[] args) {
        Path path = Paths.get("c:\\Apps", "jdk1.8.0_91");
        try {
            Files.walkFileTree(path, new FileVisitorImpl());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class FileVisitorImpl extends SimpleFileVisitor<Path>{
        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            format("preVisitDirectory [%s]", dir);
            return FileVisitResult.SKIP_SUBTREE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            return super.visitFile(file, attrs);
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
            return super.visitFileFailed(file, exc);
        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            format("postVisitDirectory [%s]", dir);
            return super.postVisitDirectory(dir, exc);
        }
    }
}
