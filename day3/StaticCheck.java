package day3;

public class StaticCheck {
    public static void main(String[] args) {
        System.out.println(addition(5, 7));

        StaticCheck sc = new StaticCheck();
        System.out.println(sc.substraction(6, 5));
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public int substraction(int a, int b) {
        return a - b;
    }
}