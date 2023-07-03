package homework;

public class HomeWork1 {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;
//        a += 2;
//        b += - 2;
//        System.out.println(a);
//        System.out.println(b);
//        ||
        a = (++a + --b + 2) / 2;
        b = ((a + 2) * b) % 7 + 12 % a;
        System.out.println(a);
        System.out.println(b);
    }
}
