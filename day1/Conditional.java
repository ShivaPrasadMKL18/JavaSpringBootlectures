package day1;
public class Conditional {
    public static void main(String[] args) {
        // Conditional Statements
        // if (expression) {} else {}

        int age = 18;

        if (age < 18) {
            System.out.println("Cannot vote");
        } else {
            System.out.println("Can vote");
        }

        age = 48;

        if (age > 10 && age <= 19) {
            System.out.println("KID");
        } else if (age > 20 && age <= 29) {
            System.out.println("Teen age");
        } else if (age > 30 && age <= 50) {
            System.out.println("Adult");
        } else {
            System.err.println("Old");
        }
    }

}

// 0 - false
// 1 - true
// A B (A AND B)
// 0 0 0
// 0 1 0
// 1 0 0
// 1 1 1
