package com.example;

/**
 * @Auther:yinzhen
 * @Date:2020/12/11 23:53
 * @Description:com.example
 * @version: 1.0
 */
public class FanXingClass<A> {
    private int id;
    private A a;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public void show(){
        System.out.println("id "+id+",A "+a);
    }
}
