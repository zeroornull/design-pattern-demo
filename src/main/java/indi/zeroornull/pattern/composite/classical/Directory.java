package indi.zeroornull.pattern.composite.classical;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

// 组合类 - 目录
@Slf4j
public class Directory implements FileSystemComponent{
    private final String name;
    private final List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }
    
    // 添加子组件（叶子节点或其他组合对象）
    public void add(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void display() {
        log.info("Directory: " + name);
        // 递归显示所有子组件
        for (FileSystemComponent component : components) {
            component.display();
        }
    }
}
