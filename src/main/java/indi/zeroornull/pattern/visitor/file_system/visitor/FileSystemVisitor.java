package indi.zeroornull.pattern.visitor.file_system.visitor;

import indi.zeroornull.pattern.visitor.file_system.element.Directory;
import indi.zeroornull.pattern.visitor.file_system.element.File;

public interface FileSystemVisitor {
    
    void visit(File file);

    void visit(Directory directory);
}
