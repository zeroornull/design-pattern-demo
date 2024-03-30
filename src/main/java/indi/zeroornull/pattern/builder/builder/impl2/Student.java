package indi.zeroornull.pattern.builder.builder.impl2;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@ToString
// 两者都支持链式调用，但@Accessors的链式调用是基于对象自身的getter和setter。而使用@Builder时对象自身可以不设置setter，从而保证对象的不可变性，这是@Accessors做不到的。
// @AllArgsConstructor(access = AccessLevel.PACKAGE)
// @Accessors(chain = true)
public class Student {

    private final String name;
    private final Integer age;
    private final String address;

    // 修改1：公开的静态方法，作为Student的创建入口，符合直觉
    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    // 但禁止直接使用构造函数（包访问权限即可，给Builder留个后门）
    Student(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

}
