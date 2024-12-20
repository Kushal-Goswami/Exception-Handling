package app.exception;

import java.io.IOException;

class Parent {
    public void display() throws IOException {

    }
}

//class Child1 extends Parent {
//    public void display() throws ArithmeticException //valid
//    {
//
//    }
//}

//class Child2 extends Parent {
//    public void display() throws ArithmeticException //valid
//    {
//
//    }
//}

//class Child3 extends Parent {
//    public void display() throws IOException //invalid
//    {
//
//    }
//}

//class Child1 extends Parent {
//    public void display() //valid
//    {
//
//    }
//}

//class Child1 extends Parent {
//    public void display() throws IOException //valid
//    {
//
//    }
//}

//class Child1 extends Parent {
//    public void display() throws ArithmeticException //valid
//    {
//
//    }
//}




/* Keypoints:

1. if method in Parent class doesn't throw an Exception then the overriding
method in Child class can throw UncheckedException but not CheckedException.

2. if method in Parent class throw an UncheckedException then the overriding
method in Child class can throw UncheckedException but not CheckedException.
However in the overriding method in child class not throw any Exception it also valid

3. if method in Parent class throw CheckedException then the overriding
method in Child class can throw CheckedException.
However in the overriding method in child class can throw any UncheckedException it also valid.
 */

public class LaunchEH6 {
    public static void main(String[] args) {

    }
}
