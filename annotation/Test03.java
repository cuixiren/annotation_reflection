package com.cuixr.leishenspringboot.注解和反射.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解
public class Test03 {

    //注解可以显式赋值，如果没有默认值，我们就必须给注解赋值
    @MyAnnotation2(name = "cuicui",schools = {"长春师范大学","肯特大学"})
    public void test(){}

    @MyAnnotation3("崔喜人")
    public void test2(){}
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    //注解的参数：参数类型 + 参数名（）；
    String name() default "";
    int age() default 777;
    int id() default -1; //如果默认值为-1，代表不存在
    String[] schools() default {"清华大学","北京大学"};
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
    String value();
}