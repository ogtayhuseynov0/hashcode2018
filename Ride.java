package com.company;

import org.jcp.xml.dsig.internal.dom.Utils;

public class Ride {
    int from_x;
    int from_y;
    int to_x;
    int to_y;
    int e_start;
    int l_finish;
    boolean rided=false;
    int id;

    public Ride(int from_x, int from_y, int to_x, int to_y, int e_start, int l_finish) {
        this.from_x = from_x;
        this.from_y = from_y;
        this.to_x = to_x;
        this.to_y = to_y;
        this.e_start = e_start;
        this.l_finish = l_finish;
    }

    public int getDist(){
        return Math.abs(from_x-to_x)+Math.abs(from_y-to_y);
    }
    public int fromZero(){
        return Math.abs(from_x)+Math.abs(from_y);
    }
    public int fromCar(int c_x, int c_y){
        return e_start - (Math.abs(from_x-c_x)+Math.abs(from_y-c_y));
    }
    public int masBas(int c_x, int c_y){
        return  (Math.abs(from_x-c_x)+Math.abs(from_y-c_y));
    }
    public int getFrom_x() {
        return from_x;
    }

    public void setFrom_x(int from_x) {
        this.from_x = from_x;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFrom_y() {
        return from_y;
    }

    public void setFrom_y(int from_y) {
        this.from_y = from_y;
    }

    public int getTo_x() {
        return to_x;
    }

    public void setTo_x(int to_x) {
        this.to_x = to_x;
    }

    public int getTo_y() {
        return to_y;
    }

    public void setTo_y(int to_y) {
        this.to_y = to_y;
    }

    public int getE_start() {
        return e_start;
    }

    public void setE_start(int e_start) {
        this.e_start = e_start;
    }

    public int getL_finish() {
        return l_finish;
    }

    public void setL_finish(int l_finish) {
        this.l_finish = l_finish;
    }
}
