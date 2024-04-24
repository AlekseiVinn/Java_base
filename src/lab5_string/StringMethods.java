package lab5_string;

import java.util.Arrays;

public class StringMethods {

    public static String longestWord(String testString){
        String[] strList = testString.split("[[\\W\\s][\\s][\\W]]+");
        String longest = new String();
        for (int i = 0; i < strList.length; i++) {
            if (longest.length() < strList[i].length())
                longest = longest.length() >= strList[i].length() ? longest : strList[i];
        }
        return longest;
    }

    public static boolean isPalindrome(String testWord){
        testWord = testWord.toLowerCase();
        int len = testWord.length() / 2;
        int wordLastIndex = testWord.length()-1;
        for (int i = 0; i <= len; i++) {
            if (testWord.charAt(i) != testWord.charAt(wordLastIndex-i)){
                return false;
            }
        }
        return true;
    }

    public static String censored(String strToCensore){
        String banWord = "бяка";
        String handledBan = "[вырезано цензурой]";
        return strToCensore.replaceAll(banWord, handledBan);
    }

    public static int countSubstring(String mainStr, String subStr){
        mainStr = mainStr.toLowerCase();
        subStr = subStr.toLowerCase();
        int result = 0;
        while (mainStr.contains(subStr)){
            mainStr = mainStr.replaceFirst(subStr, "");
            result++;
        }
        return  result;
    }

    public static String reverseStr(String strToReverse){
        String[] strList = strToReverse.split(" ");
        for (int i = 0; i < strList.length; i++) {
            strList[i] = reverseWord(strList[i]);
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strList.length; i++) {
            if (i != strList.length-1){
                result.append(strList[i]).append(" ");
            } else {
                result.append(strList[i]);
            }
        }
        return result.toString();
    }

    private static String reverseWord(String word){
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length()-1; i >=0 ; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }
}
