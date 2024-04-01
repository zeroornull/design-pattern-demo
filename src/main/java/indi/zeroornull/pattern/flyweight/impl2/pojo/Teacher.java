package indi.zeroornull.pattern.flyweight.impl2.pojo;

import indi.zeroornull.pattern.flyweight.impl2.FlyweightFactory;
import lombok.Data;

@Data
public class Teacher {
    
    private Long id;
    private String name;
    private String course;
    
    //
    private SchoolInfo schoolInfo;

    public Teacher(Long id, String name, String course, String schoolName, String schoolAddress, String schoolSlogan) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.schoolInfo = FlyweightFactory.getSchoolInfo(schoolName, schoolAddress, schoolSlogan);
    }
}
