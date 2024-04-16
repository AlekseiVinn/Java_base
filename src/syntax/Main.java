package syntax;


public class Main {
    public static void main(String[] args) {

        // 1 класс Calculator
        int testsumm = Calculator.Summ(7,8);
        int testsubstr = Calculator.Substr(7,8);
        int testdiv = Calculator.Div(7,8);
        int testmultiply = Calculator.Multiply(7,8);

        System.out.printf("7 + 8 = %d \n7 - 8 = %d \n7 / 8 = %d \n7 * 8 = %d \n\n",
                testsumm,testsubstr,testdiv,testmultiply);

        double doubletestsumm = Calculator.Summ(11.1,8.9);
        double doubletestsunstr = Calculator.Substr(11.1,8.9);
        double doubletestdiv = Calculator.Div(11.1,8.9);
        double doubletestmultiply = Calculator.Multiply(11.1,8.9);

        System.out.printf("11.1 + 8.9 = %f \n11.1 - 8.9 = %f \n11.1 / 8.9 = %f \n11.1 * 8.9 = %f \n\n",
                doubletestsumm,doubletestsunstr,doubletestdiv,doubletestmultiply);

        long longtestsumm = Calculator.Summ(2898987456L,3111234456L);
        long longtestsunstr = Calculator.Substr(2898987456L,3111234456L);
        long longtestdiv = Calculator.Div(2898987456L,3111234456L);
        long longtestmultiply = Calculator.Multiply(2898987456L,3111234456L);

        System.out.printf("2898987456 + 3111234456 = %d \n2898987456 - 3111234456 = %d \n" +
                        "2898987456 / 3111234456 = %d \n2898987456 * 3111234456 = %d",
                longtestsumm,longtestsunstr,longtestdiv,longtestmultiply);

        // 2 класс с несколькими кострукторами
        Song song1 = new Song(Jengre.RNB, "In da Club", "50 Cent", 3,20);
        Song song2 = new Song();
        System.out.println(song1);
        System.out.println(song2);
    }
}
