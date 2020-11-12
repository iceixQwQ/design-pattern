package com.singleto;

/**
 * @Author: Aden Tsai
 * @Date: 2020/11/11 - 11 - 11 - 20:48
 * @Description: com.singleto
 * @Version: 1.0
 */

/**
 * 懒汉式(函数加锁)
 * 函数加锁支持多线程，但需要等函数执行完，但效率下降
 */

public class Singleton04 {
    private static Singleton04 s;
    private Singleton04(){

    }

    //加锁
    public static synchronized Singleton04 getInstance() throws InterruptedException {
        if(s == null){
            //停顿
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            s = new Singleton04();
        }
        return s;
    }

    public void show(){
        System.out.println("---懒汉式成功U•ェ•*U---");
    }
}

class Test04{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //lambda
            new Thread(()->{
                try {
                    System.out.println(Singleton04.getInstance().hashCode());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}