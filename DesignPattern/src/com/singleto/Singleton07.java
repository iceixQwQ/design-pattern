package com.singleto;

/**
 * @Author: Aden Tsai
 * @Date: 2020/11/11 - 11 - 11 - 21:21
 * @Description: com.singleto
 * @Version: 1.0
 */

/**
 * 懒汉式（究极版）
 * 解决线程同步，由于枚举类没有构造方法 ，还可以防止反序列化
 */
public enum Singleton07 {
    s;
}

class Test07{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(Singleton07.s.hashCode());
            }).start();
        }
    }
}


