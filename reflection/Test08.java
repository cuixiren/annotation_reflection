package com.cui.student.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @FileName: Test08
 * @Author: cuixr
 * @Date: 2022/2/17 17:06
 * @Description:
 */
//获得类的信息
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.cui.student.entity.TestEntity");

//        TestEntity testEntity = new TestEntity();
//        c1 = testEntity.getClass();

        //获得类的名字
        System.out.println(c1.getName()); //获得包名＋类名
        System.out.println(c1.getSimpleName()); //获得类名

        //获得类的属性
        System.out.println("==============================");
//        Field[] fields = c1.getFields(); //只能找到public属性
        Field[] fields = c1.getDeclaredFields(); //找到全部的属性
        for (Field field : fields) {
            System.out.println(field);
        }

        //获得指定属性的值
//        Field name = c1.getField("name");
        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        //获得类的方法
        System.out.println("==============================");
        Method[] methods = c1.getMethods(); //获得本类及其父类的全部public方法
        for (Method method : methods) {
            System.out.println("正常的："+method);
        }
        Method[] declaredMethods = c1.getDeclaredMethods(); //获得本类的全部方法
        for (Method declaredMethod : declaredMethods) {
            System.out.println("declared："+declaredMethod);
        }

        //获得指定方法
        //重载
        Method getName = c1.getMethod("getName",null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        //获得指定的构造器
        System.out.println("==============================");
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) { //本类的public构造方法
            System.out.println(constructor);
        }
        Constructor[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) { //本类的全部构造方法
            System.out.println(declaredConstructor);
        }
        //获得指定的构造器
//        c1.getDeclaredConstructor(String.class,int.class,int.class ....); //有参构造器参数的全部类型
    }
}
