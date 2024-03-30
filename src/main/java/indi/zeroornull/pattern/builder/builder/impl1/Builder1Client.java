package indi.zeroornull.pattern.builder.builder.impl1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Builder1Client {

    public static void main(String[] args) {
        Student student = new Student.StudentBuilder().name("zeroornull").age(27).address("芜湖").build();
        log.info(String.valueOf(student));
    }

}
