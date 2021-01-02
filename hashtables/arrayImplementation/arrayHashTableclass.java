package com.test.hashtables.arrayImplementation;

import com.test.Lists.Employee;

import java.util.NoSuchElementException;

public class arrayHashTableclass {
    private Employee[] hashTable;
    public arrayHashTableclass(){
        hashTable = new Employee[10];
    }
    private int hashKey(String key){
        return key.length() % hashTable.length;
    }
    public void put(String key,Employee value){
        int hashedKey = hashKey(key);
        if (hashTable[hashedKey]!=null)
            System.out.println("TRY A UNIQUE KEY, "+ hashedKey+" is ALREADY FILLED.");
        else
        hashTable[hashedKey]=value;
    }
    public Employee get(String key){
        int hashedkey = hashKey(key);
        if (hashTable[hashedkey]==null)
            throw new NoSuchElementException();
        else
            return hashTable[hashedkey];
    }
    public void printHashTable(){
        System.out.println("-----------------------------");

        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i]!=null)
                System.out.println(i+"||"+hashTable[i]);
        }

        System.out.println("-----------------------------");
    }
}
