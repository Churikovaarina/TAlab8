package Timer;

import Filler.Filler;
import HashTable.HashTableList;
import HashTable.HashTableTree;
import Person.Person;

import java.util.Random;

public class Timer {
    public final static int INSERT_1000 = 1;
    public final static int INSERT_10000 = 2;
    public final static int INSERT_100000 = 3;
    public final static int INSERT_200000 = 4;
    public final static int SEARCH = 5;

    public double timerHashTableTree(int Method, HashTableTree<Integer, Integer> table){
        double startTime;
        double endTime;
        Random rand = new Random();

        switch (Method) {
            case INSERT_1000 -> {
                startTime = System.nanoTime();
                for (int i = 0; i < 1000; i++) {
                    int r = rand.nextInt(100000);
                    table.put(r,i+1);
                }
                endTime = System.nanoTime();
            }
            case INSERT_10000 -> {
                startTime = System.nanoTime();
                for (int i = 0; i < 10000; i++) {
                    int r = rand.nextInt(100000);
                    table.put(r,i+1);
                }
                endTime = System.nanoTime();
            }
            case INSERT_100000 -> {
                startTime = System.nanoTime();
                for (int i = 0; i < 100000; i++) {
                    int r = rand.nextInt(100000);
                    table.put(r,i+1);
                }
                endTime = System.nanoTime();
            }
            case INSERT_200000 -> {
                startTime = System.nanoTime();
                for (int i = 0; i < 200000; i++) {
                    int r = rand.nextInt(100000);
                    table.put(r,i+1);
                }
                endTime = System.nanoTime();
            }
            case SEARCH -> {
                startTime = System.nanoTime();
                for (int i = 0; i < 500; i++){
                    table.get(i);
                }
                endTime = System.nanoTime();
            }

            default -> {
                startTime = -1;
                endTime = 0;
            }
        }

        return endTime-startTime;
    }

    public double timerHashTableList(int Method, HashTableList<Person, Integer> table){
        double startTime;
        double endTime;
        Random rand = new Random();

        switch (Method) {
            case INSERT_1000 -> {
                startTime = System.nanoTime();
                for (int i = 0; i < 1000; i++) {
                    table.put(new Person(i,i+"a"),i+1);
                }
                endTime = System.nanoTime();
            }
            case INSERT_10000 -> {
                startTime = System.nanoTime();
                for (int i = 0; i < 10000; i++) {
                    table.put(new Person(i,i+"a"),i+1);
                }
                endTime = System.nanoTime();
            }
            case INSERT_100000 -> {
                startTime = System.nanoTime();
                for (int i = 0; i < 100000; i++) {
                    table.put(new Person(i,i+"a"),i+1);
                }
                endTime = System.nanoTime();
            }
            case INSERT_200000 -> {
                startTime = System.nanoTime();
                for (int i = 0; i < 200000; i++) {
                    table.put(new Person(i,i+"a"),i+1);
                }
                endTime = System.nanoTime();
            }
            case SEARCH -> {
                startTime = System.nanoTime();
                for (int i = 0; i < 500; i++){
                    table.get(new Person(i,i+"a"));
                }
                endTime = System.nanoTime();
            }

            default -> {
                startTime = -1;
                endTime = 0;
            }
        }

        return endTime-startTime;
    }
}
