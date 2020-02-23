package com.company;

import java.util.ArrayList;
import java.util.List;

public class Car {
    int c_x=0;
    int c_y=0;
    int step_at=0;
    List<Integer> rides=new ArrayList<>();
    public Car(int c_x, int c_y) {
        this.c_x = c_x;
        this.c_y = c_y;
    }

    public int getStep_at() {
        return step_at;
    }

    public void setStep_at(int step_at) {
        this.step_at = step_at;
    }

    public int getC_x() {
        return c_x;
    }

    public void setC_x(int c_x) {
        this.c_x = c_x;
    }

    public int getC_y() {
        return c_y;
    }

    public void setC_y(int c_y) {
        this.c_y = c_y;
    }
}
