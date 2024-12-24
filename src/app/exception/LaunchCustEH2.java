package app.exception;

import java.util.Scanner;

class UnderAgeException extends Exception {
    public UnderAgeException(String msg) {
        super(msg);
    }
}

class OverAgeException extends Exception {
    public OverAgeException(String msg) {
        super(msg);
    }
}

class Person {
    int age;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age ");
        age = sc.nextInt();

    }

    public void verify() throws UnderAgeException, OverAgeException {
        if (age < 18) {
            UnderAgeException un = new UnderAgeException("You're too young! Not eligible for license");
            System.out.println(un.getMessage());
            throw un;
        } else if (age > 60) {
            OverAgeException on = new OverAgeException("You're too old! Not eligible for license");
            System.out.println(on.getMessage());
            throw on;
        } else {
            System.out.println("You are eligible! Please proceed further");

        }
    }
}

class Rto {
    public void initiate() {
        Person p = new Person();

        try {
            p.input();
            p.verify();
        } catch (UnderAgeException | OverAgeException e) {

            try {
                p.input();
                p.verify();
            } catch (UnderAgeException | OverAgeException e1) {
                try {
                    p.input();
                    p.verify();
                } catch (UnderAgeException | OverAgeException e2) {

                    System.out.println("You're BLOCKED! Contact to RTO");

                }

            }
        }
    }
}

public class LaunchCustEH2 {
    public static void main(String[] args) {

        Rto r = new Rto();
        r.initiate();
    }
}
