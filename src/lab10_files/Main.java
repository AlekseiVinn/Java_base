package lab10_files;

import java.io.File;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File fileToRead = new File("files/test_1.txt");

        //задание 1
        List<String> resultList = FileParser.readInString(fileToRead);
        resultList.forEach(string -> System.out.println(string));

        //Задание 2
        File filetoWrite = FileParser.createFileFromPath("files/test_2.txt");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку для записи в " + filetoWrite.getName() + ": ");
        String lineToWrite = scan.nextLine();
        FileParser.appendToFile(filetoWrite, lineToWrite);

        //Задание 3
        File fileOneTwo = new File("files/fileOneTwo.txt");
        File fileOne = new File("files/One.txt");
        File fileTwo = new File("files/Two.txt");
        FileParser.glueTwoFiles(fileOne,fileTwo,fileOneTwo);

        //Задание 4
        FileParser.parseFileCharS(fileOneTwo);

    }






}
