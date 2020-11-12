package com.singleto;

/**
 * @Author: Aden Tsai
 * @Date: 2020/11/11 - 11 - 11 - 20:32
 * @Description: com.singleto
 * @Version: 1.0
 */

/**
 * 懒汉式
 * 不支持多线程
 */

public class Singleton03 {
    private static Singleton03 s;
    private Singleton03(){

    }

    public static Singleton03 getInstance() throws InterruptedException {
        if(s == null){
            //停顿
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            s = new Singleton03();
        }
        return s;
    }

    public void show(){
        System.out.println("---懒汉式成功U•ェ•*U---");
    }
}

class Test03{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //lambda
            new Thread(()->{
                try {
                    System.out.println(Singleton03.getInstance().hashCode());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            //传统写法
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(Singleton03.getInstance().hashCode());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
