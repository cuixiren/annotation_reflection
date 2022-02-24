package com.cuixr.leishenspringboot.注解和反射.annotation;

import java.util.ArrayList;
import java.util.List;

//什么是注解
public class Test01 extends Object{

    @Override //重写
    public String toString() {
        return super.toString();
    }

    //Deprecated 不推荐程序员使用，但是可以使用，或存在更好方式
    @Deprecated
    public static void test(){
        System.out.println("Deprecated");
    }

    @SuppressWarnings("all")
    public void test02(){
        List list= new ArrayList<>();
    }

    public static void main(String[] args) {
        test();
    }
}
