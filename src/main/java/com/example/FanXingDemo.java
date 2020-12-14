package com.example;

/**
 * @Auther:yinzhen
 * @Date:2020/12/11 23:38
 * @Description:com.example
 * @version: 1.0
 */
public class FanXingDemo {
    public static void main(String[] args) {
        /*FanXingClass<String> fanXingClass = new FanXingClass<>();
        fanXingClass.setA("yinzhen");
        fanXingClass.setId(1);
        fanXingClass.show();
        FanXingClass<Integer> fanXingClass2 = new FanXingClass<>();
        fanXingClass2.setA(234);
        fanXingClass2.setId(1);
        fanXingClass2.show();
        FanXingClass<Person> fanXingClass3 = new FanXingClass<>();
        fanXingClass3.setA(new Person("yinzhen",18));
        fanXingClass3.setId(1);
        fanXingClass3.show();*/
        /*FanXingInterfaceSub<String> sub = new FanXingInterfaceSub<>();
        sub.test2("abc");*/
        /*FanXingInterfaceSub sub = new FanXingInterfaceSub();
        sub.test2("aaa");
        System.out.println(sub.test());*/
        FanXingMethod<String> fanXingMethod = new FanXingMethod<>();
        fanXingMethod.setT("abc");
        fanXingMethod.show(123);
        fanXingMethod.show(true);

    }
}
