package com.test.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// vectors are synchronised whereas arrayList is not.
// it increases its capacity by 100 percent everytime it reaches its capacity

public class arrayListClass {
    public static void main(String[] args) {
    // default capacity of array list is 10
        // and it increases its capacity by 50 percent everytime it reaches its capacity.
        List<Employee> employeeList = new ArrayList<>();


        employeeList.add(new Employee("honey","arora",123));
        employeeList.add(new Employee("jane","jones",234));
        employeeList.add(new Employee("john","doe",345));
        employeeList.add(new Employee("mary","smith",567));


        employeeList.forEach(employee -> {
            System.out.println(employee);
        });

        System.out.println();

        System.out.println(employeeList.get(1));

        System.out.println();
        System.out.println(employeeList.isEmpty());


        System.out.println();
        employeeList.set(0,new Employee("himanshu","arora",1034));
        System.out.println(employeeList.get(0));

        System.out.println();
        System.out.println(employeeList.size());

        employeeList.add(0,new Employee("honey","arora",11111));
        System.out.println();

        employeeList.forEach(
                employee -> {
                    System.out.println(employee);
                }
        );

        System.out.println();


        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for(Employee e: employeeArray
             ) {
            System.out.println(e);

        }

        System.out.println();

        System.out.println( employeeList.contains(new Employee("honey","arora",11111)));   // to properly use this method we should override equals method in employee class


        System.out.println();
        System.out.println(employeeList.indexOf(new Employee("himanshu","arora",1034)));    // to properly use this method we should override equals method in employee class

        System.out.println();

        employeeList.remove(0);
        employeeList.forEach(employee -> {
            System.out.println(employee);
        });

    }
}
