package com.test.Lists;

import java.util.List;
import java.util.Vector;

public class vectorsClass {
    public static void main(String[] args) {

        List<Employee> employeeList = new Vector<>();


        employeeList.add(new Employee("honey","arora",123));
        employeeList.add(new Employee("jane","jones",234));
        employeeList.add(new Employee("john","doe",345));
        employeeList.add(new Employee("mary","smith",567));

        employeeList.forEach(employee -> System.out.println(employee));

    }
}
