package com.abstract_;

abstract public class Template {

    public abstract void job(); //抽象方法

    public void calcaulateTime() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("执行时间" + (end - start));
    }
}
