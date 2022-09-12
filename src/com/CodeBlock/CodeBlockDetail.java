package com.CodeBlock;

public class CodeBlockDetail {
    public static void main(String[] args) {
        // AA aa = new AA();
        System.out.println(Cat.n1);
    }
}

class Animal {

    public static int n1 = 100;

    static {
        System.out.println("Animal的静态代码块被加载");
    }

}

class Cat extends Animal {
    public static int n1 = 999;

    static {
        System.out.println("Cat的静态代码块被执行...");
    }
}

class BB {
    static {
        System.out.println("BB的静态代码块被执行");
    }
}

class AA extends BB {
    static {
        System.out.println("AA的静态代码块");
    }
}
