package com.example;

/**
 * @Auther:yinzhen
 * @Date:2020/12/12 16:51
 * @Description:com.example
 * @version: 1.0
 */
public class FanXingMethod<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <Q> void show(Q q){
        System.out.println(q);
        System.out.println(t);
    }
}
