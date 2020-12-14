package com.example;

/**
 * @Auther:yinzhen
 * @Date:2020/12/12 15:56
 * @Description:com.example
 * @version: 1.0
 */
public interface FanXingInterface<B> {
    //使用泛型作为方法的返回值类型
    public B test();
    //使用泛型作为方法的入参类型
    public void test2(B b);
}
