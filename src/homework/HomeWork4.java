package homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    //Написать программу, которая будет считывать введенные пользователем слова с клавиатуры слова,
    // и склеивать их в одно предложение до тех пор, пока пользователь не введет с клавитуры слово STOP.
    // Все слова введенные до этого должны отобразится в консоли одним предложением.
    public static void main(String[] args) {
        /*Scanner words = new Scanner(System.in);
        String arrayWords = "";
        while (true) {
            System.out.println("insert word");
            String word = words.nextLine();
            if(word.toLowerCase().trim().equals("stop")){
                break;
            }
            arrayWords = arrayWords + word;
        }
        System.out.println(arrayWords);*/

       /* TASK 2. Написать программу в которой пользователь вводит с клавиатуры число,
         а программа определяет, является она полиндромом или нет.
         И выводит данную информацию на экран.*/


        /*Scanner rt = new Scanner(System.in);
        System.out.println("Insert number: ");
        String number = rt.nextLine();
        String result = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            result = result + number.charAt(i);
        }
        if (result.equals(number)) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }*/


        /*Task 3. Написать проограмму, условно для склада приема металла. Представим, что склад может хранить определенный вес металла.
        Пользователь вводит с клавиатуры вес, который может хранится на складе. Дальше пользователь вводит с клавиатуры вес,
        который условно собирается сдать на склад. Программа должна после каждой сдачи металла показывать
        сколько веса еще может принять склад. Если пользователь хочет сдать металла больше чем осталось места на складе,
        то программа не дает ему это сделать и уведомляет пользователя, о невозможности данной операции.
        Если пользователь сдает металл весом меньше чем 5, программа тоже предупреждает о невозможности
        приемки такого малого веса. Программа завершается, когда место на складе закончилось.*/

        //Склад может хранить 1000кг металла
        /*Scanner tr = new Scanner(System.in);
        int weightOfMetal = 0;
        while (weightOfMetal <= 1000) {
            if (weightOfMetal == 1000) {
                break;
            }
            System.out.println("Сколько кг металла вы хотите сдать на склад?");
            int numberOfMetal = tr.nextInt();
            if (numberOfMetal < 5) {
                System.out.println("Вы не можете сдать металл весом < 5кг.");
                continue;
            }
            if (numberOfMetal + weightOfMetal >= 996 && numberOfMetal + weightOfMetal < 1000) {
                System.out.println("На складе осталось места: " + (1000 - (weightOfMetal + numberOfMetal)));
                System.out.println("Склад заполнен потому что нельзя сдать < 5кг");
                break;
            }
            if (weightOfMetal + numberOfMetal > 1000) {
                System.out.println("Вместимость склада превышена.");
                System.out.println("На складе осталось места: " + (1000 - weightOfMetal));
                continue;
            }
            weightOfMetal = weightOfMetal + numberOfMetal;
            System.out.println("На складе осталось места на такой вес металла: " + (1000 - weightOfMetal));
        }*/

        /* Task 4 Первый будет состоять из следующих имен: “Петя”, “Маша”, “Алёна”, “Федя”, “Саша”, “Антон”, “Глеб”.
        Второй будет содержать следующие значения типа int: 10, 12, 14, 16, 18, 20.
        Третий будет содержать следующие значения: “школу”, “магазин”, “церковь”, “тренажерный зал”, “кино”, “поликлинику”.
        Пользователь вводит три числа с клавиатуры, которые будут соответствовать индексам каждого из элементов массивов.
        Пример1. после ввода 3,2,1: На экране должно вывестись следующее сообщение: “Федя будет идти в магазин в 14:00”
        Пример2. после ввода 1,2,3: На экране должно вывестись следующее сообщение: “Маша будет идти в тренажерный зал в 14:00”*/

        Scanner rt = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = rt.nextInt();
        System.out.println("Введите второе число");
        int number2 = rt.nextInt();
        System.out.println("Введите третье число");
        int number3 = rt.nextInt();
        String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        String[] places = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику", "домой"};
        int[] time = {10, 12, 14, 16, 18, 20};
        System.out.println(names[number1 - 1] + " будет идти в " + places[number2 - 1] + " в " + time[number3 - 1] + ":00");

            /* Task 5. Есть одномерный массив из 10 элементов, заполненный случайными числами.
            Пользователь вводит с клавиатуры число.
             Программа показывает есть ли такое число в созданном до этого массиве.
             у меня выходит или выводится массив заполненый случайными числами или не работает */

        /*int[] array = new int[10];
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert number");
        int chislo = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(11);
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == chislo) {
                System.out.println("\nV massive est takoe chislo");
                return;
            }
        }
        System.out.println("\nВ массиве нет такого числа");*/

        /*int number = sc.nextInt();
        String plus = "В массиве есть такое число";
        String minus = "В массиве нет такого числа";
        String result = massiv[0] == number ? plus :
                massiv[1] == number ? plus :
                massiv[2] == number ? plus :
                massiv[3] == number ? plus :
                massiv[4] == number ? plus :
                massiv[5] == number ? plus :
                massiv[6] == number ? plus :
                massiv[7] == number ? plus :
                massiv[8] == number ? plus :
                massiv[9] == number ? plus : minus;
        System.out.println(result);*/

        /*Task 6. Заполнить массив на 45 элементов случайными числами от -50 до +50.
        Найти минимальный элемент и вывести его на консоль.
        Найти максимальный элемент и вывести его на консоль.*/

       /* Random gh = new Random();
        int[] array = new int[45];
        for (int i = 0; i < array.length; i++) {
            array[i] = gh.nextInt(-50, 50);
            System.out.print(array[i] + " ");
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        for (int number : array) {
            System.out.print(number + " ");
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("\nМинимальный элемент массива: " + min);
        System.out.println("\nМаксимальный элемент массива: " + max);*/
    }
}


