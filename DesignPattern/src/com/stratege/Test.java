package com.stratege;

import java.util.Random;

/**
 * @Author: Aden Tsai
 * @Date: 2020/11/11 - 11 - 11 - 22:14
 * @Description: com.stratege
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Person[] arr = new Person[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int tmp = random.nextInt(100);
            arr[i] = new Person(tmp, tmp);
        }
        for (Person person : arr) {
            System.out.println(person);
        }
        System.out.println("--------------------------------");
        Sort.selectSort(arr, (Comparator<Person>) (o1, o2) -> {
            return o1.getHeight() > o2.getHeight() ? 1 : -1;
        });
        for (Person person : arr) {
            System.out.println(person);
        }
    }

}
