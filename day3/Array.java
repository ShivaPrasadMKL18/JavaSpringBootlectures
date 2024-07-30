package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Arrays = The homogeneous (same yype of data) collection of data. 
public class Array {
    public static void main(String[] args) {

        int[] arr = new int[5]; // declartions

        int arr1[] = new int[20]; // declartions

        int arr2[] = { 1, 2, 3, 4, 5, 6 }; // initialization
        /*
         * 0 1 2 3 4 5 6 7 8 ------ index
         * 1 2 3 4 5 6 7 8 9 ------ array values
         */
        System.out.println(arr2[2]);

        // For loop
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();

        // For-each loop
        for (int a : arr2) {
            System.out.print(a + " ");
        }

        System.out.println();
        Scanner scan = new Scanner(System.in);
        arr[0] = scan.nextInt();
        arr[1] = scan.nextInt();
        arr[2] = scan.nextInt();

        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a value : ");
            arr[i] = scan.nextInt();
        }

        System.out.println();
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}

/*
 * 1) Check whether the given array is palindrome or not.
 * 2) Reverse a array with using taking extra spaces or variable.
 * 3) Search for a target element exist in a array or not.
*/