package com.single_;

/**
 * 演示 懒汉式 单例模式
 */
public class SingleTon02 {
    public static void main(String[] args) {
        Cat instance1 = Cat.getInstance();
        System.out.println(instance1);

        Cat instance2 = Cat.getInstance();
        System.out.println(instance2);

        System.out.println(instance1 == instance2);

    }
}

class Cat {
    private String name;
    private static Cat cat;

    public Cat(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }
    public static Cat getInstance() {
        if(cat == null) {
            cat = new Cat("xiaokeai");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
