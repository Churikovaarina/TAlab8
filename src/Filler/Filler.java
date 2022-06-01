package Filler;

import HashTable.HashTableList;
import HashTable.HashTableTree;
import Person.Person;

import java.util.Random;

public class Filler {
    Random rand = new Random();
    public HashTableList<Person,Integer> HashTableListFiller(HashTableList<Person,Integer> table, int N){
        for (int i = 0; i < N; i++) {
            table.put(new Person(i,i+"a"),i+1);
        }
        return table;
    }

    public HashTableTree<Integer,Integer> HashTableTreeFiller(HashTableTree<Integer,Integer> table, int N){
        for (int i = 0; i < N; i++) {
            int r = rand.nextInt(10000);
            table.put(r,i+1);
        }
        return table;
    }

}
