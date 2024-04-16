package syntax.song;


public class Main {
    public static void main(String[] args) {

        // 2) класс с несколькими кострукторами
        Song song1 = new Song(Jengre.RNB, "In da Club", "50 Cent", 3,20);
        Song song2 = new Song();
        System.out.println(song1);
        System.out.println(song2);
    }
}
