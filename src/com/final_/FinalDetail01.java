package com.final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        CC cc = new CC();

        new EE().cal();
    }
}

class AA {
    public final double TAX_RATE = 0.08;
    public final double TAX_TAYTE2;
    public final double TAX_TAYTE3;

    public AA() {
        TAX_TAYTE2 = 1.1;
    }

    {
        TAX_TAYTE3 = 2.2;
    }
}

class BB {
    public static final double TAX_RATE = 1.1;
    public static final double TAX_RATE1;

//    public static final double TAX_RATE2;
//    public BB() {
//        TAX_RATE2 = 2.2;
//    }

    static {
        TAX_RATE1 = 3.3;
    }
}

//final类不能继承,但是可以实例化对象
final class CC {
}

class DD {
    public final void cal() {
        System.out.println("cal()方法");
    }
}

//类不是final类,但是有final方法,该方法不能重写,但是可以被继承
class EE extends DD {
}