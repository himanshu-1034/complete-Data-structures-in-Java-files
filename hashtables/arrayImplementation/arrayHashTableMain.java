package com.test.hashtables.arrayImplementation;

import com.test.Lists.Employee;

public class arrayHashTableMain {
    public static void main(String[] args) {
        arrayHashTableclass hashtable = new arrayHashTableclass();
        Employee e1 = new Employee("honey","arora",123);
        Employee e2 = new Employee("jane","jones",234);
        Employee e3 = new Employee("john","doe",345);
        Employee e4 = new Employee("mary","smith",567);

        hashtable.put("arora",e1);
        hashtable.put("doe",e3);

        hashtable.printHashTable();

        hashtable.put("smith",e4);

        System.out.println(hashtable.get("arora"));
        System.out.println(hashtable.get("q"));
    }
}
