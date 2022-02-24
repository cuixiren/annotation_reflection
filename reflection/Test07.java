package com.cui.student.reflect;

/**
 * @FileName: Test07
 * @Author: cuixr
 * @Date: 2022/2/17 16:32
 * @Description:
 */
public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取系统类加载器的父类加载器-->扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        //获取扩展类加载器的父类加载器-->根加载器（c++编写的）
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        //测试当前类是那个加载器加载的
        ClassLoader classLoader = Test07.class.getClassLoader();
        System.out.println(classLoader);

        //测试JDK内置的类是谁加载的
        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1);

        //如何获得系统类加载器可加载的路径
        /*
        C:\Program Files\Java\jdk1.8.0_271\jre\lib\charsets.jar;
        E:\Maven\resp\org\slf4j\slf4j-api\1.7.30\slf4j-api-1.7.30.jar;
        C:\Program Files\JetBrains\IntelliJ IDEA 2021.2\lib\idea_rt.jar;
        ...
         */
        System.out.println(System.getProperty("java.class.path"));
        //双亲委派机制 保护自带类（如String类无法重写）
    }
}
