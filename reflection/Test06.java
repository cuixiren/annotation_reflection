package com.cui.student.reflect;

/**
 * @FileName: Test06
 * @Author: cuixr
 * @Date: 2022/2/17 15:43
 * @Description:
 */
//测试类什么时候会初始化
public class Test06 {
    static {
        System.out.println("Main类被加载");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        //1.主动引用
//        Son son = new Son();

        //2.反射也会产生主动引用
//        Class.forName("com.cui.student.reflect.Son");

        //3.不会产生类的引用的方法
//        System.out.println(Son.b); //子类未被加载
//        Son[] array = new Son[5]; //只有数组名和空间

        System.out.println(Son.M); //父类子类都未被加载
    }
}

class Father {
    static int b = 2;

    static {
        System.out.println("父类被加载");
    }
}

class Son extends Father{
    static {
        System.out.println("子类被加载");
        m = 300;
    }
    static int m = 100;
    static final int M = 7;
}
