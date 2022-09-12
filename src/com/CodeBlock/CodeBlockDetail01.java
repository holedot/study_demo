package com.CodeBlock;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //A a = new A();
        B b = new B();
        //for
        System.out.println(b);

        //toString 源码

    }
}

class A {


    private  int n2 = getN2();

    private static int n1 = getN1();

    {
        System.out.println("普通代码块被调用");
    }

    static {
        System.out.println("静态代码块被执行");
    }

    public static int getN1() {
    System.out.println("getN1被调用");
        return 100;
    }

    public int getN2() {
        System.out.println("getN2被调用");
        return 200;
    }

}

class B{
    String name = "rew";
    int age = 20;

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
