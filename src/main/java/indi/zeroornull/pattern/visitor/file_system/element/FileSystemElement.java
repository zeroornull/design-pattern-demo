package indi.zeroornull.pattern.visitor.file_system.element;

import indi.zeroornull.pattern.visitor.file_system.visitor.FileSystemVisitor;

public interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
}
