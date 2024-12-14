package app.exception;

import java.util.Scanner;

public class LaunchEH2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Application started");
            System.out.println("Enter the numerator");
            int n1 = sc.nextInt();
            System.out.println("Enter the denominator");
            int n2 = sc.nextInt();
            int res = n1 / n2;
            System.out.println("result is " + res);
            System.out.println("Enter the size of the Array");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the element which need to be add");
            int element = sc.nextInt();
            System.out.println("Enter the position no to add the element");
            int position = sc.nextInt();
            arr[position] = element;
            System.out.println("The element " + element + " at position " + position + " are added successfully");

        } catch (ArithmeticException e) {
            System.out.println("Please provide proper denominator");
        } catch (NegativeArraySizeException e) {
            System.out.println("Array size should not be negative");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Do not cross Array's limit");
        } catch (Exception e) {
            System.out.println("Please enter the valid input");
        }
        System.out.println("Application ended");
    }
}
