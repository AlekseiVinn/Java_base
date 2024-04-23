package lab4_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Methods {
    //Часть 1
    //выводит на консоль нечетные числа от 1 до 99. Каждое число печатается с новой строки.
    public static void oddOneToHundred(){
        for (int i = 1; i <=99; i++){
            if (i % 2 != 0)
                System.out.println(i);
        }
    }

    //выводит числа от 1 до 100, которые делятся на 3, 5 и на 15
    public static void divByThreeFive(){
        StringBuilder divThree = new StringBuilder("Делится на 3: ");
        StringBuilder divFive = new StringBuilder("Делится на 5: ");
        StringBuilder divFifteen = new StringBuilder("Делитcя на 3 и на 5: ");

        for (int i = 1; i <=100; i++){
            if (i % 3 == 0){
                divThree.append(i + ", ");
                if (i % 5 == 0){
                    divFive.append(i + ", ");
                    divFifteen.append(i + ", ");
                }
            } else if (i % 5 == 0) {
                divFive.append(i + ", ");
            }
        }
        System.out.println(divThree);
        System.out.println(divFive);
        System.out.println(divFifteen);
    }

    //вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу
    public static boolean isSumOfTwo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scan.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();

        int summ = num1 + num2;
        System.out.println("Введите третье число: ");
        int num3 = scan.nextInt();

        return summ == num3;
    }

    //принимает от пользователя три целых числа и возвращает true, если второе число больше первого числа, а третье число больше второго числа
    public static boolean isIncreasingSeq(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scan.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();

        System.out.println("Введите третье число: ");
        int num3 = scan.nextInt();

        return num2 > num1 && num3 > num2;
    }

    //проверить, появляется ли число 3 как первый или последний элемент массива целых чисел. Длина массива должна быть больше или равна двум
    public static boolean isThreeFirstAndLast(int[] array){
        int first = array[0];
        int last = array[array.length-1];
        return first == 3 && last == 3;
    }

    //проверить, что массив содержит число 1 или 3.
    public static boolean hasOneOrThree(int[] array){
        for (int i : array){
            if (i == 1 || i == 3)
                return true;
        }
        return false;
    }

    //Часть 2
    //проверяет отсортирован ли массив по возрастанию. Если отсортирован - выводится “OK”, если нет - выводиться текст “Please, try again”
    public static void isAscending(int[] array){
        boolean ascCheck = true;

        for (int i = 0; i < array.length-2; i++) {
            if (array[i] > array[i+1]){
                ascCheck = false;
                System.out.println("Please, try again");
                break;
            }
        }
        if (ascCheck)
            System.out.println("OK");
    }

    //считывает с клавиатуры длину массива.
    //затем пользователь вводит числа массива и на новой строке выводится полученный массив
    public static void fillArray(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Array length: ");
        int arrayLen = scan.nextInt();

        int[] array = new int[arrayLen];
        System.out.println("Numbers of array:");
        for (int i = 0; i < arrayLen; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(array));
    }

    //меняет местами первый и последний элементы массива
    public static void swapFirstLast(int[] array){
        int first = array[0];
        int last = array[array.length-1];

        array[0] = last;
        array[array.length-1] = first;
    }

    //возвращает первое уникальное число из массива
    public static int getUnique(int[] array){
        if (array.length == 1){
            return array[0];
        }

        boolean isUnique;
        for (int i = 0; i < array.length; i++) {
            isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j){
                    if (isUnique)
                        isUnique = array[i] != array[j];
                }
            }
            if (isUnique)
                return array[i];
        }
        return array[array.length-1];
    }

    //заполяент массив случайными числами и сортирует их (сортировка слинянием)
    public static void randomSortArray(){
        Random rnd = new Random();
        int arrayLen = rnd.nextInt(16);
        System.out.println("Array lengh = " + arrayLen);
        int[] array = new int[arrayLen];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(25);
        }
        System.out.println("Array given:");
        System.out.println(Arrays.toString(array));

        array = mergeSort(array);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }


    private static int[] mergeSort(int[] array) {
        //System.out.println(Arrays.toString(array));

        if (array.length < 2) {
            return array;
        }

        int mid = array.length / 2;

        int[] left = new int[mid];

        int[] right;

        if (array.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = array[mid + i];
        }

        left = mergeSort(left);
        right = mergeSort(right);


        return mergeParts(left, right);
    }

    private static int[] mergeParts(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        //System.out.println(Arrays.toString(left));
        //System.out.println(Arrays.toString(right));

        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }

        return result;
    }


}
