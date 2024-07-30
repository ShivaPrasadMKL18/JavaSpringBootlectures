package day1; 

public class Loops {
    public static void main(String[] args) {
        int num = 10;
        // for - pre test loop
        // Syntax - (initialization, expression, increment/decrement)
        for (int i = 0; i < num; i++) {
            System.out.println("For : " + i);
        }

        // while - pre test loop
        // Syntax - initialization while(expression) { increment/decrement }
        int i = 0; // initialization
        while (i < num) {
            System.out.println("While : " + i);
            i++;
        }

        // do.. while - post test loop
        i = 0;
        do {
            i++;
            System.out.println("Do - While : " + i);
        } while (i < num);

        // for-each
        Integer[] a = { 1, 2, 3, 4, 5, 6 };
        for (Integer item : a) {
            System.out.println("Foreach : " + item);
        }
    }
}
