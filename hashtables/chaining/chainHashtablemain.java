package com.test.hashtables.chaining;

import com.test.Lists.Employee;

public class chainHashtablemain {
    public static void main(String[] args) {
        Employee e1 = new Employee("honey","arora",123);
        Employee e2 = new Employee("jane","jones",234);
        Employee e3 = new Employee("john","doe",345);
        Employee e4 = new Employee("mary","smith",567);


        chainHashtableclass hashtable = new chainHashtableclass();

        hashtable.put("arora",e1);
        hashtable.put("doe",e3);

        hashtable.printHashtable();

        hashtable.put("smith",e4);

        System.out.println(hashtable.get("arora"));
//        System.out.println(hashtable.get("q"));
        hashtable.put("jones",e2);
        hashtable.remove("arora");
        hashtable.printHashtable();

        System.out.println(hashtable.get("smith"));
    }
}
