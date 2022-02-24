package com.cuixr.leishenspringboot.注解和反射.annotation;

import java.lang.annotation.*;

//测试元注解
public class Test02 {
    @MyAnnotation
    public void test(){

    }
}

//定义一个注解
//Target 表示我们的注解可以在哪些地方生效，可以传一个数组
@Target(value = {ElementType.METHOD,ElementType.TYPE})
//Retention 表示我们的注解在什么地方有效 runtime>class>sources
@Retention(value = RetentionPolicy.RUNTIME)
//Documented 表示是否将我们的注解生成在JAVAdoc中
@Documented
//Inherited 子类可以继承父类的注解
@Inherited
@interface MyAnnotation{}