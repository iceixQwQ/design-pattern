package com.singleto;

/**
 * @Author: Aden Tsai
 * @Date: 2020/11/11 - 11 - 11 - 21:08
 * @Description: com.singleto
 * @Version: 1.0
 */

/**
 * 懒汉式(静态内部类)
 * 类加载的时候静态内部类不加载
 * JVM保证线程安全
 */
public class Singleton06 {
    private Singleton06(){

    }

    private static class Loader {
        private static final Singleton06 s = new Singleton06();
    }

    public static Singleton06 getInstance(){
        return Loader.s;
    }
}

class Test06{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //lambda
            new Thread(()->{
                System.out.println(Singleton06.getInstance().hashCode());
            }).start();
        }
    }
}
