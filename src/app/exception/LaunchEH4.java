package app.exception;

import java.util.Scanner;

class Alpha {
    void display() throws Exception {


        Scanner sc = new Scanner(System.in);

        System.out.println("Application started");
        System.out.println("Enter the numerator");
        int n1 = sc.nextInt();
        System.out.println("Enter the denominator");
        int n2 = sc.nextInt();

        int res = n1 / n2;
        System.out.println("Result is " + res);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element which need to be add");
        int element = sc.nextInt();
        System.out.println("Enter the position no to add the element");
        int position = sc.nextInt();
        arr[position] = element;
        System.out.println("The element " + element + " at position " + position + " are added successfully");


        System.out.println("Application ended");
    }
}

public class LaunchEH4 {
    public static void main(String[] args) {
        System.out.println("Main method application started");
        Alpha a = new Alpha();
        try {
            a.display();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }

        System.out.println("Main method application ended");
    }
}
