package indi.zeroornull.pattern.composite.classical;

import lombok.extern.slf4j.Slf4j;

@Slf4j
 class File implements FileSystemComponent{
     private final String name;

     public File(String name) {
         this.name = name;
     }

     @Override
     public void display() {
         log.info("File: " + name);
     }
 }
