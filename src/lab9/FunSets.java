package lab9;

import java.util.*;


public class FunSets {

    //получает коллецию и вовзращает коллекцию без дубликатов
    public static Collection<Object> collectionAsSet(Collection<Object> colAsSet){
//        return new ArrayList<Object>(new HashSet<Object>(colAsSet));
        return new HashSet<Object>(colAsSet);
    }

    public static void fillOneMln(Collection<Object> listToFill){

        Random rnd = new Random();
        for (int i = 0; i < 1_000_000; i++) {
            listToFill.add(rnd.nextInt(30));
        }
    }

    public static void seedMap(Map<User,Integer> hashMap){
        Random rnd = new Random();
        hashMap.put(new User("Адольф"), rnd.nextInt(25));
        hashMap.put(new User("Иосиф"), rnd.nextInt(25));
        hashMap.put(new User("Франклин"), rnd.nextInt(25));
        hashMap.put(new User("John"), rnd.nextInt(25));
        hashMap.put(new User("Ann"), rnd.nextInt(25));
    }

    public static void scoreOf(Map<?,?> hashMap){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя игрока: ");
        String playerName = scanner.next();
        User player = new User(playerName);
        if (hashMap.containsKey(player)){
            System.out.println("У игрока с именем \"" + player.getName() + "\" " + hashMap.get(player));
        } else {
            System.out.println("Игрок с именем \"" + player.getName() + "\" не найден");
        }

    }
}
