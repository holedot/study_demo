package com.final_;

public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(AAA.num);
    }
}

final class AAA {
    //final和static搭配使用可以不导致类加载,效率更高
    public final static int num = 1000;

    static {
        System.out.println("静态代码块被执行");
    }
}
