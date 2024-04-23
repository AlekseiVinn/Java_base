package lab4_arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Часть 1.1
        Methods.oddOneToHundred();

        //Часть 1.2
        Methods.divByThreeFive();

        //Часть 1.3
        System.out.println("Результат: " + Methods.isSumOfTwo());

        //Часть 1.4
        System.out.println("Результат: " + Methods.isIncreasingSeq());

        int[] array1 = {3, -3, 7, 4, 1, 5, 4, 3};
        int[] array2 = {5, -3, 7};
        //Часть 1.5
        System.out.println(Methods.isThreeFirstAndLast(array1));
        System.out.println(Methods.isThreeFirstAndLast(array2));

        //Часть 1.6
        System.out.println(Methods.hasOneOrThree(array1));
        System.out.println(Methods.hasOneOrThree(array2));

        int[] array3 = {-4, -4, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        //Часть 2.1
        Methods.isAscending(array1);
        Methods.isAscending(array2);
        Methods.isAscending(array3);

        //Часть 2.2
        Methods.fillArray();

        //Часть 2.3
        System.out.println("Массив до:\t\t" + Arrays.toString(array3));
        Methods.swapFirstLast(array3);
        System.out.println("Массив после:\t" + Arrays.toString(array3));

        //Часть 2.4
        System.out.println(Methods.getUnique(new int[]{0,0}));
        System.out.println(Methods.getUnique(new int[]{0,1}));
        System.out.println(Methods.getUnique(new int[]{1,0}));
        System.out.println(Methods.getUnique(new int[]{0,0,1}));
        System.out.println(Methods.getUnique(new int[]{1,0,1}));
        System.out.println(Methods.getUnique(new int[]{1,0,0}));
        System.out.println(Methods.getUnique(array3));

        //Часть 2.5
        Methods.randomSortArray();
        Methods.randomSortArray();
        Methods.randomSortArray();


    }
}
