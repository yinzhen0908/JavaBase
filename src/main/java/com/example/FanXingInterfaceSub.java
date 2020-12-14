package com.example;

/**
 * @Auther:yinzhen
 * @Date:2020/12/12 16:03
 * @Description:com.example
 * @version: 1.0
 */
public class FanXingInterfaceSub implements FanXingInterface<String> {
    @Override
    public String test() {
        return "aaa";
    }

    @Override
    public void test2(String b) {
        System.out.println(b);
    }
}
