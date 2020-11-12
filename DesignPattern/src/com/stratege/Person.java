package com.stratege;

/**
 * @Author: Aden Tsai
 * @Date: 2020/11/11 - 11 - 11 - 22:04
 * @Description: com.stratege
 * @Version: 1.0
 */
public class Person {
    private double height;
    private double weight;

    public Person() {
    }

    public Person(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
