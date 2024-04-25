package lab5_string;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        String test = "Тестовые случаи для поля «Имя», текстового блока, текстового поля: В этом посте мы обсудим тестирование текстового поля.";
        String test2 = "Unfortunately, Unicode brings its own requirements and pitfalls when it comes to regular expressions";

        // не работает со строкой с юникодом - можете помочь, пожалуйтса?
        String str = StringMethods.longestWord(test);
        System.out.println(str);

        String str2 = StringMethods.longestWord(test2);
        System.out.println(str2);

        //Задание 2
        String word1 = "Madam";
        String word2 = "Мадам";
        String word3 = "car";
        System.out.println(StringMethods.isPalindrome(word1));
        System.out.println(StringMethods.isPalindrome(word2));
        System.out.println(StringMethods.isPalindrome(word3));

        //Задание 3
        String toBann1 = "Кулебяка, бяка-бяка";
        String toBann2 = "Кулебляка";
        String toBann3 = "Ничего не баним";
        String banWord = "бяка";
        String handledBan = "[вырезано цензурой]";
        System.out.println(StringMethods.censored(toBann1, banWord, handledBan));
        System.out.println(StringMethods.censored(toBann2, banWord, handledBan));
        System.out.println(StringMethods.censored(toBann3, banWord, handledBan));

        //Задание 4
        System.out.println(StringMethods.countSubstring(toBann1, "бяка"));
        System.out.println(StringMethods.countSubstring(toBann2, "к"));
        System.out.println(StringMethods.countSubstring(toBann3, "бяка"));

        //Задание 5
        System.out.println(test);
        System.out.println(StringMethods.reverseStr(test));
        System.out.println(test2);
        System.out.println(StringMethods.reverseStr(test2));
    }
}
