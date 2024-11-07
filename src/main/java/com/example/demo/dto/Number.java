package com.example.demo.dto;

/**
 * @TimeStamp 2024-11-07 21:10
 * @ProjectDetails demo
 * @Author udarasan
 */

//encapsulate bean (tightly)
public class Number {
    private int num23;
    private int num24;

    public Number(int num23, int num24) {
        this.num23 = num23;
        this.num24 = num24;
    }

    public Number() {
    }

    public int getNum23() {
        return num23;
    }

    public void setNum23(int num23) {
        this.num23 = num23;
    }

    public int getNum24() {
        return num24;
    }

    public void setNum24(int num24) {
        this.num24 = num24;
    }
}
