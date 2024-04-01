package indi.zeroornull.pattern.strategy.impl2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;

@Slf4j
public class SortTest {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("刘备", 60, 160));
        list.add(new Person("关羽", 58, 180));
        list.add(new Person("张飞", 56, 170));

        // 场景1：按身高从低到高（可以借助IDEA优化成方法引用）
        list.sort((o1, o2) -> o1.height - o2.height);
        log.info(list.toString());

        // 场景2：按年龄从大到小（可以借助IDEA优化成方法引用）
        list.sort((o1, o2) -> o2.age - o1.age);
        log.info(list.toString());
    }

    @Data
    @AllArgsConstructor
    static class Person {
        private String name;
        private Integer age;
        private Integer height;
    }

}
