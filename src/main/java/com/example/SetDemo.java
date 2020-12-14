package com.example;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * @Auther:yinzhen
 * @Date:2020/12/11 23:13
 * @Description:com.example
 * @version: 1.0
 */
public class SetDemo {
    public static void main(String[] args) {
        /*HashSet set = new HashSet();
        set.add(new Person("张山",18));
        set.add(new Person("张山",18));
        set.add(new Person("李四",19));
        System.out.println(set);*/
        TreeSet set = new TreeSet();
        set.add(new Person("张山",18));
        set.add(new Person("张山",18));
        set.add(new Person("李四",19));
        System.out.println(set);
    }
}
