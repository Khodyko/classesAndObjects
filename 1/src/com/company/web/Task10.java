package com.company.web;

public class Task10 {
    public static final int t13=12;
    public static final String t14="aabc";
    Integer field=15;
    static Integer stat_field=15;
    static {
        System.out.println("static");
    }
    {
        System.out.println("non static");
    }

    public Task10() {
    }

    public static int getT13() {

        return t13;
    }

    public Integer getField() {
        return field;
    }

    public void setField(Integer field) {
        this.field = field;
    }

    public static Integer getStat_field() {
        return stat_field;
    }

    public static void setStat_field(Integer stat_field) {
        Task10.stat_field = stat_field;
    }
}
