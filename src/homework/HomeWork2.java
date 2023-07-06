package homework;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        // завдання №1
        String string1 = "This line that i want to cut, cause it is too long";
        String string2 = string1.substring(0, 35);
        String string3 = string1.replace("too long", "perfect");
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string1.length());
        System.out.println(string2.length());
        System.out.println(string3.length());
        System.out.println("=======================================");


        // завдання №2
        String string = "Testing, is my favourite job";
        String word1 = "'Testing'";
        String word2 = "'is'";
        String word3 = "'my'";
        String word4 = "'favourite'";
        String word5 = "'job'";
        //варіант 1
        System.out.println("слово 1" + " " + "=" + " " + word1 + "," + " " + "длінна цього слова" + " " + "=" + " " + word1.length());
        System.out.println("слово 2" + " " + "=" + " " + word2 + "," + " " + "длінна цього слова" + " " + "=" + " " + word2.length());
        System.out.println("слово 3" + " " + "=" + " " + word3 + "," + " " + "длінна цього слова" + " " + "=" + " " + word3.length());
        System.out.println("слово 4" + " " + "=" + " " + word4 + "," + " " + "длінна цього слова" + " " + "=" + " " + word4.length());
        System.out.println("слово 5" + " " + "=" + " " + word5 + "," + " " + "длінна цього слова" + " " + "=" + " " + word5.length());
        boolean result = (word1.length() > word2.length() && word1.length() > word3.length()
                && word1.length() > word4.length() && word1.length() > word5.length());
        System.out.println(result);
        System.out.println("=================");
        //варіант 2
//        int LengthWord1 = word1.length();
//        int LengthWord2 = word2.length();
//        int LengthWord3 = word3.length();
//        int LengthWord4 = word4.length();
//        int LengthWord5 = word5.length();
//        boolean result = (LengthWord1 > LengthWord2 && LengthWord1 > LengthWord3
//                && LengthWord1 > LengthWord4 && LengthWord1 > LengthWord5);
//        System.out.println(word1 + " " + "=" + " " + LengthWord1 + " " + "знаків");
//        System.out.println(word2 + " " + "=" + " " + LengthWord2 + " " + "знаків");
//        System.out.println(word3 + " " + "=" + " " + LengthWord3 + " " + "знаків");
//        System.out.println(word4 + " " + "=" + " " + LengthWord4 + " " + "знаків");
//        System.out.println(word5 + " " + "=" + " " + LengthWord5 + " " + "знаків");
//        System.out.println(result);

        // завдання №3

        String randomText = "Completely random text in English. " +
                "In it, we just need to determine how many times the character 'a' occurs there. " +
                "And we can use the split method and the length method.";
        String bottomRegisterText = randomText.toLowerCase();
        System.out.println(bottomRegisterText.split("a").length);
        System.out.println(bottomRegisterText.split("a").length - 1);
        // эксперементальный метод проб и ошибок))) надеюсь оцените шутку и потраченное время
        System.out.println("=========================");
        System.out.println(randomText.toLowerCase().split("a").length);
        String subStringString = randomText.substring(0, 12) + randomText.substring(13, 73) + randomText.substring(74, 89) +
                randomText.substring(90, 91) + randomText.substring(92, 98) + randomText.substring(99, 115)
                + randomText.substring(116, 123) + randomText.substring(124, 147)
                + randomText.substring(148, 169);
        System.out.println(randomText.length());
        System.out.println(subStringString.length());
        System.out.println(randomText.length() - subStringString.length());





    }
}
