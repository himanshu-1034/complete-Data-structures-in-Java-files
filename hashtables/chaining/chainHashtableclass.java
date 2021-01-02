package com.test.hashtables.chaining;

import com.test.Lists.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class chainHashtableclass {

    private LinkedList<storedEmployee>[] hashtable;

    public chainHashtableclass(){
        hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<storedEmployee>();
        }
    }

    public void put(String key, Employee employee){
        int hashedkey = getHashkey(key);
        hashtable[hashedkey].add(new storedEmployee(key,employee));
    }

    public Employee get(String key){
        int hashedkey = getHashkey(key);
        ListIterator<storedEmployee> iterator = hashtable[hashedkey].listIterator();

        storedEmployee employee = null;
        while (iterator.hasNext()){
            employee = iterator.next();
            if (employee.key.equals(key)){
                return employee.employee;
            }
        }
        return null;
    }

    public Employee remove(String key){
        int hashkey = getHashkey(key);

        storedEmployee employee = null;

        ListIterator<storedEmployee> listIterator = hashtable[hashkey].listIterator();
        int index=-1;
        while (listIterator.hasNext()){
            employee = listIterator.next();
            index++;
            if (employee.key.equals(key))
                break;
        }

        if (employee==null){
            return null;
        }
        else {
            hashtable[hashkey].remove(index);
            return employee.employee;
        }


    }


    public void printHashtable(){
        System.out.println("---------------------------------");

        for (int i = 0; i < hashtable.length; i++) {
            if (!hashtable[i].isEmpty()){
                System.out.print(i+":  ");
                ListIterator<storedEmployee> listIterator = hashtable[i].listIterator();
                while (listIterator.hasNext()){
                    System.out.print(listIterator.next().employee+"--");
                }
                System.out.println("null");

            }
        }

        System.out.println("---------------------------------");

    }



    private int getHashkey(String key){
//        return key.length() % hashtable.length;

        return Math.abs(key.hashCode()%hashtable.length);

    }


}
