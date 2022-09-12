package com.final_;

public class Final01 {
}

//1)不希望A类被其他类继承 使用final修饰
final class A {}
//class B extends A {}

//2)不希望父类的某个方法被子类覆盖/重写(override)
//3)不希望类的某个属性的值被修改
//4)不希望某个局部变量的值被修改