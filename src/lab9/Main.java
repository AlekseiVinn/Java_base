package lab9;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //задание 1
//        Collection<Object> testColl1 = new ArrayList<>();
//        System.out.println(testColl1);
//        testColl1.addAll(Arrays.asList(1,1,1,22,22,22,22,1515, "th", "sth", "th", 'c', 'c', 'b', true, true, false));
//        System.out.println(testColl1);
//        testColl1 = FunSets.collectionAsSet(testColl1);
//        System.out.println(testColl1);

        //задание 2
//        long startTime = System.currentTimeMillis();
//
//        List<Object> testArrayList = new ArrayList<>();
//        FunSets.fillOneMln(testArrayList);
//
//        long endTime = System.currentTimeMillis();
//        System.out.println("TestArrayList took " + (endTime - startTime) + " milliseconds");
//        System.out.println(testArrayList.size());
//
//        long startTime1 = System.currentTimeMillis();
//
//        List<Object> testLinkedList = new LinkedList<>();
//        FunSets.fillOneMln(testLinkedList);
//
//        long endTime1 = System.currentTimeMillis();
//        System.out.println("TestLinkedList took " + (endTime1 - startTime1) + " milliseconds");
//        System.out.println(testLinkedList.size());

        //задание 3
        Map<User,Integer> scores = new HashMap<>();
        FunSets.seedMap(scores);

        scores.forEach((k, v) -> System.out.printf("%-10s : %s%n", k.getName(), v));;

        FunSets.scoreOf(scores);

    }
}
