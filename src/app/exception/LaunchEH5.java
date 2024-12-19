package app.exception;

import java.util.Scanner;

class Calculation {
    void display() throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Application started");
        System.out.println("Enter the numerator");
        int n1 = sc.nextInt();
        System.out.println("Enter the denominator");
        int n2 = sc.nextInt();
        try {
            int res = n1 / n2;
            System.out.println("Result is " + res);

        } catch (Exception e) {
            System.out.println("Exception caught in Calculation class display method");
            throw e;

        } finally {
            System.out.println("Application Finished");
        }

    }
}

public class LaunchEH5 {
    public static void main(String[] args) {
        System.out.println("Main method started");
        Calculation c = new Calculation();
        try {
            c.display();
        } catch (Exception e) {
            System.out.println("Exception caught in main");
        }
    }
}
