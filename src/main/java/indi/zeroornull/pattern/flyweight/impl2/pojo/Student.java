package indi.zeroornull.pattern.flyweight.impl2.pojo;

import indi.zeroornull.pattern.flyweight.impl2.FlyweightFactory;
import lombok.Data;

@Data
public class Student {
    private Long id;
    private String name;
    
    // 学生证号码
    private String studentNumber;
    
    private SchoolInfo schoolInfo;
    
    public Student(Long id, String name, String studentNumber, String schoolName, String schoolAddress, String schoolSlogan) {
        this.id = id;
        this.name = name;
        this.studentNumber = studentNumber;
        this.schoolInfo = FlyweightFactory.getSchoolInfo(schoolName, schoolAddress, schoolSlogan);
    }
    
}
