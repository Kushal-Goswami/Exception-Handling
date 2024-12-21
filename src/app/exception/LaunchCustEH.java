package app.exception;

import java.util.Scanner;

class BadCredentialException extends Exception {
    public BadCredentialException(String msg) {
        super(msg);
    }
}

class Atm {
    int acc = 1234;
    int passWord = 3256;

    int accNo;
    int pwd;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the account number: ");
        accNo = sc.nextInt();
        System.out.println();
        System.out.print("Enter the password: ");
        pwd = sc.nextInt();
    }

    public void verify() throws BadCredentialException {
        if (acc == accNo && passWord == pwd) {
            System.out.println("Transaction successful, please proceed further");
        } else {
            BadCredentialException exe = new BadCredentialException("Invalid Credentials");
            System.out.println(exe.getMessage());
            throw exe;
//                throw new BadCredentialException("Invalid Credentials");
        }

    }
}

class Bank {
    public void initiate() {
        Atm a = new Atm();

        try {
            a.input();
            a.verify();
        } catch (BadCredentialException e) {


            try {
                a.input();
                a.verify();
            } catch (BadCredentialException e1) {
                try {
                    a.input();
                    a.verify();
                } catch (BadCredentialException e2) {
                    System.out.println("Access denied, Blocked");
                }
            }
        }


    }
}

public class LaunchCustEH {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.initiate();
    }
}
