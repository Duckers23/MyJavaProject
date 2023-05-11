package PAckege_1;

public class HomeWork {
    public static void main(String[] args) {
        int mercedes = (1 + (3*(2-4))%3 + (11-7)*2)+(3-5)*3;
        int volvo = mercedes*3 - 9%mercedes + 16-(-mercedes);
        int opel = mercedes%volvo;
        System.out.println(mercedes);
        System.out.println(volvo);
        System.out.println(opel);
        System.out.println("===========");
        int x = 3;
        int y = ++x*2;
        x+=-y*3 + ++x + --y;
        y+=(-x++)%3;
        int z = x + y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
