package lab10_files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileParser {

    private static final String regEx = "[^\\p{LD}]";

//    1.	Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
    public static List<String> readInString(File file){
        List<String> result = new ArrayList<>();
        String nextLine;
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            while ((nextLine = reader.readLine()) != null){
                if (nextLine.isEmpty())
                    continue;
                result.add(nextLine);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

//    2.	Написать метод, который записывает в файл строку, переданную параметром.
    public static void appendToFile(File file, String writeLine){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))){
            writer.append(writeLine).append("\n");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static File createFileFromPath(String pathString) throws IOException {
        File resultFile = new File(pathString);
        resultFile = resultFile.createNewFile() ? resultFile : resultFile;
        return resultFile;
    }

//    3.	Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.
    public static File glueTwoFiles(File firstFile, File secondFile, File resultFile) throws IOException {
        resultFile.createNewFile();
        List<String> resultList = readInString(firstFile);
        resultList.addAll(readInString(secondFile));
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(resultFile, true))){
            for (String string : resultList) {
                writer.append(string);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return resultFile;


    }

//    4.	Написать метод который заменяет в файле все кроме букв и цифр на знак ‘$’
    public static void parseFileCharS(File fileToParse){
        List<String> resulList = readInString(fileToParse);
        clearFile(fileToParse);
        for (String writeLine : resulList){
            writeLine = writeLine.replaceAll(regEx, "\\$");
            appendToFile(fileToParse, writeLine);
        }
    }

    public static void clearFile(File file){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            writer.write("");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
