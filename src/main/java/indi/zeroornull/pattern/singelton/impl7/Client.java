package indi.zeroornull.pattern.singelton.impl7;

public class Client {
    public static void main(String[] args) {
        // 编译报错
//         PersonEnum personEnum = new PersonEnum();
        // 正确用法
        PersonEnum student = PersonEnum.STUDENT;
        student.jump();
    }
}
