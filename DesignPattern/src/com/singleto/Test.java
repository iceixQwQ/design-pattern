package com.singleto;

/**
 * @Author: iceixQwQ
 * @Date: 2020/11/11 - 11 - 11 - 20:11
 * @Description: com.singleto
 * @Version: 1.0
 */

/**
 * 单例模式
 */
public class Test {
    private static Test t;
    public static Test getInstance(){
        if(t == null){
            synchronized (Test.class){
                if(t == null){
                    t = new Test();
                }
            }
        }
        return t;
    }
}
