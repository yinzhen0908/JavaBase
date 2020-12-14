package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

/**
 * @Auther:yinzhen
 * @Date:2020/12/9 11:41
 * @Description:com.example
 * @version: 1.0
 */
public class ColletionDemo {
    public static void main(String[] args) {

        HashSet set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(true);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-----------");
        //下面的写法要比上面的写法更好，因为下面的变量只在for循环内的局部变量，作用域范围比上面的要小
        //从内存消耗方面看，它在内存中遗留的时间就要少，所以更好
        for (Iterator iter = set.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }
    }

}
