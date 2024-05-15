package lab9_collections;

import java.util.*;


public class FunCollections {

    private static final Integer boundary = 30;

    //получает коллецию и вовзращает коллекцию без дубликатов
    public static Collection<Object> collectionAsSet(Collection<Object> collectionAsSet){
        return new ArrayList<>(new HashSet<>(collectionAsSet));
        //return new HashSet<>(collectionAsSet);

    }

    //забивает коллекцию 1 млн случайных значений от 0 до boundary (если boundary нет, то по умолчанию от 0 до 30 невключительно)
    public static void fillOneMln(Collection<Object> listToFill, int boundary){
        Random rnd = new Random();
        for (int i = 0; i < 1_000_000; i++) {
            listToFill.add(rnd.nextInt(boundary));
        }
    }

    public static void fillOneMln(Collection<Object> listToFill){
        Random rnd = new Random();
        for (int i = 0; i < 1_000_000; i++) {
            listToFill.add(rnd.nextInt(boundary));
        }
    }

    //выбирает из коллекции случайные элементы 100_000 раз
    // Разница в скорости выполнения метода между ArrayList и LinkedList вызвана тем, что скорость
    // выполнения команды get(i) у ArrayList'а составляет О(1), в то время как у LinkedList - O(n) (кроме
    // крайних случаев).
    public static List<Object> randomOneHundredThousand(List<Object> listSource){
        ArrayList<Object> result = new ArrayList<>();
        Random rnd = new Random();
        int maxSize = listSource.size();
        for (int i = 0; i < 100_000; i++) {
            result.add(listSource.get(rnd.nextInt(maxSize)));
        }
        return result;
    }

    //заполнение map-списка участниками со случайными баллами от 0 до 25
    public static void seedMap(Map<User,Integer> hashMap){
        Random rnd = new Random();
        hashMap.put(new User("Адольф"), rnd.nextInt(25));
        hashMap.put(new User("Иосиф"), rnd.nextInt(25));
        hashMap.put(new User("Франклин"), rnd.nextInt(25));
        hashMap.put(new User("John"), rnd.nextInt(25));
        hashMap.put(new User("Ann"), rnd.nextInt(25));
    }


    //считывает из консоли имя и показывает в консоли очки ползьователя
    public static void scoreOf(Map<User,Integer> hashMap, String playerName){
        User player = new User(playerName);
        if (hashMap.containsKey(player)){
            System.out.println("У игрока с именем \"" + player.getName() + "\" " + hashMap.get(player) + " очков.");
        } else {
            System.out.println("Игрок с именем \"" + player.getName() + "\" не найден");
        }

    }
}
