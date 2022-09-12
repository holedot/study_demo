package com.abstract_;

public class BB extends Template{
    @Override
    public void job() {
        long num = 0;
        for (long i = 0; i < 600; i++) {
            num *= i;
        }
    }
}
