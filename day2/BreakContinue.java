package day2;

public class BreakContinue {
    public static void main(String[] args) {
        // break - its used in loops and it comes out of the loop;
        int i = 0;

        for (i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
        }
        System.out.println(i);

        // continue - its used in loops and it skips particular condition based
        // statement;

        int j = 0;
        for (j = 0; j < 10; j++) {
            if (j == 5)
                continue;
            System.out.println("J : " + j);
        }
    }
}
