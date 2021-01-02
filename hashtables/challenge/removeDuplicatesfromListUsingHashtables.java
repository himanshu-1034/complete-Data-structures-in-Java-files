package com.test.hashtables.challenge;

import com.test.Lists.Employee;

import java.util.*;

public class removeDuplicatesfromListUsingHashtables {
    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        Hashtable<Integer,Employee> hashtable = new Hashtable<>();

        ListIterator<Employee> listIterator = employees.listIterator();

//        while (listIterator.hasNext()){
//            Employee employee = listIterator.next();
//            hashtable.putIfAbsent(employee.getId(),employee);
//        }
//
//        Iterator<Employee> iterator = hashtable.values().iterator();
//
//        while (iterator.hasNext())
//            System.out.println(iterator.next());

        List<Employee> removed = new ArrayList<>();

        while (listIterator.hasNext()){
            Employee employee = listIterator.next();
            if (hashtable.containsKey(employee.getId())){
                removed.add(employee);
            }
            else {
                hashtable.put(employee.getId(),employee);
            }
        }

        for (Employee employee:removed) {
            employees.remove(employee);
        }

        ListIterator listIterator1 = employees.listIterator();
        while (listIterator1.hasNext())
            System.out.println(listIterator1.next());


    }
}
