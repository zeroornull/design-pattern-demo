package indi.zeroornull.pattern.visitor.walk_file;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * NIO包对于Visitor Pattern的应用（非标准）
 */
@Slf4j
public class WalkFileTest {
    public static void main(String[] args) throws IOException {
        String path = "E:\\IDEA_Project_20210819\\design-pattern-demo\\src\\main\\java\\indi\\zeroornull\\pattern\\visitor\\double_dispatch";
        log.info("{}", path);
        Files.walkFileTree(Paths.get(path), new FileNamePrintVisitor());
    }

    static class FileNamePrintVisitor implements FileVisitor<Path> {

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            log.info("{}", file.getFileName());
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
            return FileVisitResult.TERMINATE;
        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            return FileVisitResult.CONTINUE;
        }
    }
}
