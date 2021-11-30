package com.company.web;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
//        //Task 1
        Tasks task = new Tasks();
//        int t1 = 12;
//        Integer t1_1 = 23;
//
//        task.task1(t1);
//        task.task1(t1_1);
//        task.task1(null);
//        //Task 2
//        Integer t2 = 30;
//        String t2_1 = "abc";
//        task.task2(t2);
//        task.task2(t2_1);
////		task.task2(null); can't resolve
//        //Task 3
//        String t3 = "abc";
//        Object t3_1 = task;
//        task.task3(t3);
//        task.task3(t3_1);
//        task.task3(null);
        //Task 8
        int t8_1 = 3;
        task.task8(t8_1);
        System.out.println("t8_1= " + t8_1);
        //Task 9
        Integer t9_1 = 30000;
        task.task9(t9_1);
        System.out.println("t9_1= " + t9_1);
        //Task 10
        Task10 task10 = new Task10();
        Task10 task10_1 = new Task10(); // watch output
        //Task 11
        //non static fields
        //fields were = 15
        task10.field = 12;
        System.out.println(task10.field + ", " + task10_1.field);
        // static fields
        //fields were = 15
        task10.stat_field = 12;
        System.out.println(task10.stat_field + ", " + task10_1.stat_field);
        //Task 12
        task.task12();
        Tasks.task12_1();
        //Task 13 //screenshot
        //System.out.println(task10.t13=10);//public static final
        //Task 14 //screenshot
        //Task10.t14="aaa;

//        String a="asdasada";
//        task10.t14=a;
        //Task16
        Task16 task16=new Task16();
        //Task17 comment this punkt to see another tasks
        Task17 task17=new Task17(); //no default constructor
        //Task 20
        Tassk20Child tassk20Child=new Tassk20Child();
//        //Task 22
//        Task22 task22 = new Task22();
//        Task22 task22_1 = new Task22();
//        // static instance constructor instance constructor


    }


}
