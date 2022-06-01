package Timer;

import Filler.Filler;
import HashTable.HashTableList;
import HashTable.HashTableTree;
import Person.Person;

public class MainTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Filler filler = new Filler();

        //HashTableList
        HashTableList<Person, Integer> tableList1Filled = new HashTableList<>(1005);
        HashTableList<Person, Integer> tableList2Filled = new HashTableList<>(10005);
        HashTableList<Person, Integer> tableList3Filled = new HashTableList<>(100005);
        HashTableList<Person, Integer> tableList4Filled = new HashTableList<>(200005);
        filler.HashTableListFiller(tableList1Filled,1000);
        filler.HashTableListFiller(tableList2Filled,10000);
        filler.HashTableListFiller(tableList3Filled,100000);
        filler.HashTableListFiller(tableList4Filled,200000);

        HashTableList<Person, Integer> tableList1 = new HashTableList<>(1000);
        HashTableList<Person, Integer> tableList2 = new HashTableList<>(10000);
        HashTableList<Person, Integer> tableList3 = new HashTableList<>(100000);
        HashTableList<Person, Integer> tableList4 = new HashTableList<>(200000);

        System.out.println("HashTableList: ");
        System.out.println("filling with 1000 elements: " + timer.timerHashTableList(Timer.INSERT_1000, tableList1) + " ns");
        System.out.println("filling with 10000 elements: " + timer.timerHashTableList(Timer.INSERT_10000, tableList2) + " ns");
        System.out.println("filling with 100000 elements: " + timer.timerHashTableList(Timer.INSERT_100000, tableList3) + " ns");
        System.out.println("filling with 200000 elements: " + timer.timerHashTableList(Timer.INSERT_200000, tableList4) + " ns");
        System.out.println("searching 500 elements (1000 elements in table): " + timer.timerHashTableList(Timer.SEARCH, tableList1Filled) + " ns");
        System.out.println("searching 500 elements (10000 elements in table): " + timer.timerHashTableList(Timer.SEARCH, tableList2Filled) + " ns");
        System.out.println("searching 500 elements (100000 elements in table): " + timer.timerHashTableList(Timer.SEARCH, tableList3Filled) + " ns");
        System.out.println("searching 500 elements (200000 elements in table): " + timer.timerHashTableList(Timer.SEARCH, tableList4Filled) + " ns");

    }

}
