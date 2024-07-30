package day4;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();

        boolean flag = containsVowels(str);
        System.out.println(flag);
    }

    public static boolean containsVowels(String str) {
        for (int i = 0; i < str.length(); i++) {
            char vowels = str.charAt(i);
            if (vowels == 'a' || vowels == 'e' || vowels == 'i' || vowels == 'o' || vowels == 'u') {
                return true;
            }
        }
        return false;
    }
}
