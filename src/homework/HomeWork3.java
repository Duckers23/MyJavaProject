package homework;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        //#1
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Insert text");
////        Я тестирую замечательно. Что еще нужно?
//        String string1 = myScanner.next();
//        String string2 = myScanner.next();
//        String string3 = myScanner.next();
//        String string4 = myScanner.next() +" "+ myScanner.next() +" "+ myScanner.next();
//        System.out.println(string1);
//        System.out.println(string2);
//        System.out.println(string3);
//        System.out.println(string4);
////        System.out.println(string4 + " " + myScanner.next() + " " + myScanner.next());

        //#2
//        Scanner theScanner = new Scanner(System.in);
//        System.out.println("Введите первое целочисленное значение");
//        int a = theScanner.nextInt();
//        System.out.println("Введите второе целочисленное значение");
//        int b = theScanner.nextInt();
//        System.out.println("Введите третье целочисленное значение");
//        int c = theScanner.nextInt();
//        if (a < b + c && b < a + c && c < a + b) {
//            System.out.println("Треугольник можно построить");
//        } else {
//            System.out.println("Треугольник нельзя построить");
//        }
//
//        //№3
////        При помощи тернарного оператора необходимо получить разность двух чисел введенных с клавиатуры,
////        и всегда отнимать от большего меньшее.
////        Вывести эту разность в консоль.
//        Scanner theScanner1 = new Scanner(System.in);
//        System.out.println("Введите первое число");
//        int e = theScanner1.nextInt();
//        System.out.println("Введите второе число");
//        int q = theScanner1.nextInt();
//        int number1 = (e - q);
//        int number2 = (q - e);
//        int raznost = e > q ? number1 : q > e ? number2 : number1;
//        System.out.println(raznost);

        //#4
//        (Использовать операторы if-else-if)
//        Пользоватьель вводит с клавиатуры числа:
//        Если число равно 1, то выводин на консоль "Понедельник";
//        Если число равно 2, то выводин на консоль "Вторник";
//        Если число равно 3, то выводин на консоль "Среда";
//        Если число равно 4, то выводин на консоль "Четверг";
//        Если число равно 5, то выводин на консоль "Пятница";
//        Если число равно 6, то выводин на консоль "Суббота";
//        Если число равно 7, то выводин на консоль "Воскресенье";
//        В противном случае выводим текст: "Лучше бы сегодня была пятница".

//        Scanner theScanner2 = new Scanner(System.in);
//        System.out.println("Введите число");
//        int x = theScanner2.nextInt();
//        if (x == 1) {
//            System.out.println("Понедельник");
//        } else if (x == 2) {
//            System.out.println("Вторник");
//        } else if (x == 3) {
//            System.out.println("Среда");
//        } else if (x == 4) {
//            System.out.println("Четверг");
//        } else if (x == 5) {
//            System.out.println("Пятница");
//        } else if (x == 6) {
//            System.out.println("Суббота");
//        } else if (x == 7) {
//            System.out.println("Воскресенье");
//        } else {
//            System.out.println("Лучше бы сегодня была пятница");
//        }

//        #5 Написать программу, используя тернарный оператор, где пользователь вводит с клавиатуры два
//        числа и символ - или + или % или / или *. На экран выводится резултат действия над двумя введенными числами.
//                Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.

//        Scanner theScanner3 = new Scanner(System.in);
//        System.out.println("Введите первое число");
//        int number1 = theScanner3.nextInt();
//        System.out.println("Введите второе число");
//        int number2 = theScanner3.nextInt();
//        System.out.println("Введите символ");
//        String symbol = theScanner3.nextLine();
//        String symbol1 = "+";
//        String symbol2 = "%";
//        String symbol3 = "/";
//        String symbol4 = "*";
//        int first = (number1 + number2);
//        int second = (number1 % number2);
//        int third = (number1 / number2);
//        int forth = (number1 * number2);
//        int zero = 0;
//        int result = symbol1.equals(symbol1) ? first : symbol2.equals(symbol2) ? second :
//                symbol3.equals(symbol3) ? third : symbol4.equals(symbol4) ? forth : zero;
//        System.out.println(result); ?????????????????????????????????????????????

        //#6 Используя оператор switch написать программу, которая выводит на консоль ссылку
        //для скачивания программы. Из выбора программ взять: IntelliJ IDEA, Git, Java.
        //Из выбора ОС взять: Linux, macOS, Windows. Программа должна спросить пользователя какая программа ему интересна,
        //также спросить какую ОС он использует, а после вывести в консоль необходимую ссылку.
        //Если программа с таким названием не существует выводит сообщение в консоль, о том
        //что такой программы не существует. Если указанной пользователем ОС нет, то выводится сообщение в консоль,
        //о том что такой ОС не существует.

        Scanner theScanner4 = new Scanner(System.in);
        System.out.println("Какую программу вы хотите скачать?");
        String programs = theScanner4.nextLine();


        switch (programs.toLowerCase().trim()) {
            case ("intellij idea"):
                System.out.println("Какую ОС вы используете?");
                String OC1 = theScanner4.nextLine();
                switch (OC1.toLowerCase().trim()) {
                    case ("linux"):
                        System.out.println("https://www.jetbrains.com/idea/download/?fromIDE=&section=linux");
                        break;
                    case ("macos"):
                        System.out.println("https://www.jetbrains.com/idea/download/?fromIDE=&section=mac");
                        break;
                    case ("windows"):
                        System.out.println("https://www.jetbrains.com/idea/download/?fromIDE=&section=windows");
                        break;
                    default:
                        System.out.println("Нет такой ОС");
                }
                break;
            case ("git"):
                System.out.println("Какую ОС вы используете?");
                String oc2 = theScanner4.nextLine();
                switch (oc2.toLowerCase().trim()) {
                    case ("linux"):
                        System.out.println("https://gitforlinux.org/");
                        break;
                    case ("macos"):
                        System.out.println("https://gitformacOs.org/");
                        break;
                    case ("windows"):
                        System.out.println("https://gitforwindows.org/");
                        break;
                    default:
                        System.out.println("Нет такой ОС");
                }
                break;
            case ("java"):
                System.out.println("Какую ОС вы используете?");
                String oc3 = theScanner4.nextLine();
                switch (oc3.toLowerCase().trim()) {
                    case ("linux"):
                        System.out.println("https://www.java.com/en/download/for/linux");
                        break;
                    case ("windows"):
                        System.out.println("https://www.java.com/en/download/for/windows");
                        break;
                    case ("macos"):
                        System.out.println("https://www.java.com/en/download/for/macOs");
                        break;
                    default:
                        System.out.println("Нет такой ОС");
                }
                break;
            default:
                System.out.println("нет такой программы");

        }


    }
}
