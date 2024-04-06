package indi.zeroornull.pattern.visitor.file_system;

import indi.zeroornull.pattern.visitor.file_system.element.Directory;
import indi.zeroornull.pattern.visitor.file_system.element.File;
import indi.zeroornull.pattern.visitor.file_system.visitor.CalculateSizeVisitor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileTest {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory documents = new Directory("documents");
        File file1 = new File("file1.txt", 10);
        File file2 = new File("file2.txt", 20);

        documents.addElement(file1);
        documents.addElement(file2);
        root.addElement(documents);

        CalculateSizeVisitor sizeVisitor = new CalculateSizeVisitor();
        root.accept(sizeVisitor);
        log.info("Total size: {}", sizeVisitor.getTotalSize());
    }
}
