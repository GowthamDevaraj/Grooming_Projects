package com.IAMTHEBESTICANDOIT;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B {
    public static void main(String[] args) {
        List<A> employees = Arrays.asList(
                new A("Alice", 5000),
                new A("Bob", 3000),
                new A("Charlie", 6000),
                new A("Bob", 4000));

                List<A> highEarners = employees.stream().filter(emp->emp.salary>4000).collect(Collectors.toList());
                System.out.println("Employees earning more than $4000: " + highEarners);
    }
}

