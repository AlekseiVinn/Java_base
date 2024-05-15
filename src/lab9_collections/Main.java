package lab9_collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //задание 1
        Integer[] numbers = {1,1,1,22,22,22,22,1515};
        Collection<Object> testColl1 = new ArrayList<>(Arrays.asList(numbers));
        Collection<Object> testColl2 = new ArrayList<>(List.of(new String[]{"th", "sth", "th"}));
        Collection<Object> testColl3 = new ArrayList<>(List.of(new Character[]{'c', 'c', 'b'}));
        Collection<Object> testColl4 = new ArrayList<>(List.of(new Boolean[]{true, true, false}));

        testColl1 = FunCollections.collectionAsSet(testColl1);
        testColl2 = FunCollections.collectionAsSet(testColl2);
        testColl3 = FunCollections.collectionAsSet(testColl3);
        testColl4 = FunCollections.collectionAsSet(testColl4);
        //System.out.println(testColl1 + "\n" + testColl2 + "\n" + testColl3 + "\n" + testColl4);

        //задание 2
//        long startTime11 = System.currentTimeMillis();
//        List<Object> testArrayList = new ArrayList<>();
//        FunCollections.fillOneMln(testArrayList, 40);
//        long endTime11 = System.currentTimeMillis();
//        System.out.println("TestArrayList took " + (endTime11 - startTime11) + " milliseconds");
//        System.out.println(testArrayList.size());

//        long startTime12 = System.currentTimeMillis();
//        List<Object> testArrayListChoice = FunCollections.randomOneHundredThousand(testArrayList);
//        long endTime12 = System.currentTimeMillis();
//        System.out.println("TestArrayListChoice took " + (endTime12 - startTime12) + " milliseconds");
//        System.out.println(testArrayListChoice.size());

//        long startTime21 = System.currentTimeMillis();
//        List<Object> testLinkedList = new LinkedList<>();
//        FunCollections.fillOneMln(testLinkedList);
//        long endTime21 = System.currentTimeMillis();
//        System.out.println("TestLinkedList took " + (endTime21 - startTime21) + " milliseconds");
//        System.out.println(testLinkedList.size());

//        long startTime22 = System.currentTimeMillis();
//        List<Object> testLinkedChoice = FunCollections.randomOneHundredThousand(testLinkedList);
//        long endTime22 = System.currentTimeMillis();
//        System.out.println("testLinkedChoice took " + (endTime22 - startTime22) + " milliseconds");
//        System.out.println(testLinkedChoice.size());


//      задание 3
        Map<User,Integer> scores = new HashMap<>();
        FunCollections.seedMap(scores);

        System.out.println("Список игроков:");
        scores.forEach((k,v) -> System.out.println(k.getName()));;
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя игрока, чтобы узнать его очки в игре: ");
        String playerName = scanner.next();
        FunCollections.scoreOf(scores, playerName);

    }
}
