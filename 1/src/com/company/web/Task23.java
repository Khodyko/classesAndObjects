package com.company.web;

import java.util.Objects;

public class Task23 {
    String t23;


    public void t23Method(){

    }
    public Task23(String t23) {
        this.t23 = t23;


    }
    {this.t23Method();}

    public Task23() {
        this("abc");
    }
    //Task 24
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task23)) return false;
        Task23 task23 = (Task23) o;
        return Objects.equals(t23, task23.t23);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t23);
    }
}
