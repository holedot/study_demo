package com.abstract_;

public interface Paintable {
    void draw();
}

class Quadrangle {
    public void doAnything() {
        System.out.println("四边形提供的方法");
    }
}

class Parallelogram extends Quadrangle implements Paintable {

    @Override
    public void draw() {

    }
}
