package com.abstract_;

public class AA extends Template{

    @Override
    public void job() {
        long num = 0;
        for (long i = 0; i < 10000; i++) {
            num += i;
        }
    }
}
