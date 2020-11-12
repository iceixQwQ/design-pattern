package com.singleto;

/**
 * @Author: Aden Tsai
 * @Date: 2020/11/11 - 11 - 11 - 20:26
 * @Description: com.singleto
 * @Version: 1.0
 */

/**
 * 饿汉式(静态代码块)
 * JVM保证线程安全
 */
public class Singleton02 {
    private static final Singleton02 s;
    static{
        s = new Singleton02();
    }
    private Singleton02(){

    }

    public static Singleton02 getInstance() {
        return s;
    }


    public void show() {
        System.out.println("---饿汉式成功U•ェ•*U---");
    }
}

class Test02{
    public static void main(String[] args) {
        Singleton02 s1 = Singleton02.getInstance();
        Singleton02 s2 = Singleton02.getInstance();
        if(s1 == s2){
            s1.show();
        }
    }
}
