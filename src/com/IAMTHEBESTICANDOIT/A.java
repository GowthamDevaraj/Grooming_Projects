package com.IAMTHEBESTICANDOIT;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {

     public String name;
     public int salary;

    public A(String name, int salary) {

        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return

                ", name='" + name + '\'' +
                ", salary=" + salary
                ;
    }
}


