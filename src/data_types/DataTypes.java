package data_types;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        // 1.
        String[] strings = {"Я", "хорошо", "знаю", "Java."};
        //System.out.println(strings);
        for (String str:strings){
            System.out.println(str);
        }

        // 2.
        System.out.println();
        double result1 = (46 + 10) * ((double)10 / 3);
        System.out.printf("%.4f \n", result1);
        int result2 = 29 * 4 * (-15);
        System.out.println(result2);

        // 3.
        System.out.println();
        int number = 10500;
        double result = ((double) number/10)/10;
        System.out.println(result);

        // 4.
        System.out.println();
        double num1 = 3.6;
        double num2 = 4.1;
        double num3 = 5.9;
        result = num1 * num2 * num3;
        System.out.println(result);

        // 5.
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        System.out.println("1-е число: " + input1);
        System.out.println("2-е число: " + input2);
        System.out.println("3-е число: " + input3);

        // 6.
        System.out.println();
        int b = scanner.nextInt();
        if (b % 2 == 0){
            if (b > 100) {
                System.out.println("Выход за пределы диапазона");
            } else {
                System.out.println("Четное");
            }
        } else {
            System.out.println("Нечетное");
        }
        scanner.close();
    }
}
