package com.singleto;

/**
 * @Author: Aden Tsai
 * @Date: 2020/11/11 - 11 - 11 - 20:55
 * @Description: com.singleto
 * @Version: 1.0
 */

/**
 * 懒汉式(代码块加锁双重判断)
 * 代码块加锁双重判断提升效率，支持多线程
 */
public class Singleton05 {
    private static Singleton05 s;
    private Singleton05(){

    }

    //加锁
    public static Singleton05 getInstance() throws InterruptedException {
        //第一次判断（其实是为了new成功后，不再上锁，不可以去掉）
        if(s == null){
            //上锁
            synchronized(Singleton05.class){
                //第二次判断
                if(s == null){
                    try{
                        Thread.sleep(10);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    s = new Singleton05();
                }
            }
        }
        return s;
    }

    public void show(){
        System.out.println("---懒汉式成功U•ェ•*U---");
    }
}

class Test05{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //lambda
            new Thread(()->{
                try {
                    System.out.println(Singleton05.getInstance().hashCode());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
