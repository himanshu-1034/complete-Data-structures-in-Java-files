package com.test.hashtables.linearProbing;

// this is a simple way of handelling collisions in a hashtable.


import com.test.Lists.Employee;

import java.util.NoSuchElementException;

public class linearProbingclass {
    private storedEmployee[] hashTable;
    public linearProbingclass(){
        hashTable = new storedEmployee[10];
    }
    private int hashKey(String key){
        return key.length() % hashTable.length;
    }
    public void put(String key, Employee value){
        int hashedKey = hashKey(key);

        if (isOccupied(hashedKey)){
        int stopIndex = hashedKey;
        if (hashedKey==hashTable.length-1){
            hashedKey=0;
        }else {
            hashedKey++;
        }
        while (isOccupied(hashedKey) && hashedKey!=stopIndex){
            hashedKey=(hashedKey+1) % hashTable.length;

        }


        }

        if (isOccupied(hashedKey))
            System.out.println("TRY A UNIQUE KEY, "+ hashedKey+" is ALREADY FILLED.");
        else
            hashTable[hashedKey]=new storedEmployee(key,value);
    }

    public Employee get(String key){


        int hashedkey = findKey(key);
        if (hashedkey==-1)
            throw new NoSuchElementException();
        else
            return hashTable[hashedkey].employee;
    }

    private int findKey(String key){
        int hashedKey = hashKey(key);

        if (hashTable[hashedKey]!=null && hashTable[hashedKey].key.equals(key)){
            return hashedKey;
        }

            int stopIndex = hashedKey;
            if (hashedKey==hashTable.length-1){
                hashedKey=0;
            }else {
                hashedKey++;
            }
            while (!hashTable[hashedKey].key.equals(key)&& hashTable[hashedKey]!=null && hashedKey!=stopIndex){
                hashedKey=(hashedKey+1) % hashTable.length;

            }

            if (hashTable[hashedKey]!=null && hashTable[hashedKey].key.equals(key))
                return hashedKey;
            else
                return -1;

    }

    public Employee remove(String key){
        int hashedKey = findKey(key);
        if (hashedKey==-1)
            return null;

        Employee employee = hashTable[hashedKey].employee;
        hashTable[hashedKey] = null;
        storedEmployee[] oldtable = hashTable;
        hashTable = new storedEmployee[oldtable.length];
        for (int i = 0; i < oldtable.length; i++) {
            if (oldtable[i]!=null){
                put(oldtable[i].key,oldtable[i].employee);
            }
        }

        return employee;

    }

    private boolean isOccupied(int index){
        return hashTable[index]!=null;
    }
    public void printHashTable(){
        System.out.println("-----------------------------");

        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i]!=null)
                System.out.println(i+"||"+hashTable[i].employee);
        }

        System.out.println("-----------------------------");
    }
}
