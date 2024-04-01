package indi.zeroornull.pattern.strategy.impl1;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SortTest {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("刘备", 60, 160));
        list.add(new Person("关羽", 58, 180));
        list.add(new Person("张飞", 56, 170));
        list.sort();
        log.info(list.toString());
    }

    @Data
    @AllArgsConstructor
    static class Person implements Comparable<Person> {
        private String name;
        private Integer age;
        private Integer height;

        @Override
        public int compareTo(Person otherPerson) {
            return this.height - otherPerson.height;
        }
    }
    

   /* public static void main(String[] args) {
        int[] array = {1, 3, 2, 5, 4};
        bubbleSort(array);
        log.info(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }*/

}
