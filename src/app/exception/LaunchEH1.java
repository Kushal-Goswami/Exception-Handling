package app.exception;

import java.util.Scanner;

public class LaunchEH1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Application started");
            System.out.println("Enter the numerator");
            int n1 = sc.nextInt();
            System.out.println("Enter the denominator");
            int n2 = sc.nextInt();
            /*
             Exception occurs here and this method creates the Exception object and
             give it to JVM then JVM go to the method and check any Exception Handler(catch block) is present or not.
             If the Exception Handler(catch block) is present then matter goes to the Exception Handler
             and show a suitable message and executed rest of the code.
             If the Exception Handler is not present then JVM invokes the default Exception Handler which generates Exception at run time means Application abnormally terminated and
             not executed rest of the code.

             */
            int res = n1 / n2;
            System.out.println("result is " + res);
        }


        catch (Exception e)
        {
            System.out.println("Please enter the valid input");
        }
        System.out.println("Application ended");

    }
}

