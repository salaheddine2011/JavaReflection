package com.Beans;


import org.springframework.stereotype.Component;

@Component
public class FirstBean {

    private int x;
    private int y;

    public FirstBean(){

    }


    public void methodFirstBean(){
        System.out.println("First Bean");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
