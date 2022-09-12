package com.single_;

//懒汉式

public class SingleTon01 {
    public static void main(String[] args) {
        //通过方法可以获取对象
        Friend instance = Friend.getInstance();
        System.out.println(instance);
    }
}

class Friend {
    private String name;

    //创建的对象可能没使用，造成资源的浪费
    private static Friend gf = new Friend("xiaohong");

    private Friend(String name) {
        //System.out.println("构造器被调用");
        this.name = name;
    }

    public static Friend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                '}';
    }
}