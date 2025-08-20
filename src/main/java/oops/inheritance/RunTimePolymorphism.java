package oops.inheritance;

class A{
    int i = 10;
}

public class RunTimePolymorphism extends A {
    int i = 20;
    public static void main(String[] args) {
        A object = new RunTimePolymorphism();
        System.out.println("i value is: " + object.i); // It will print parent class int i value
        RunTimePolymorphism obj = new RunTimePolymorphism();
        System.out.println("i value is: " + obj.i); // It will print child class int i value
    }
}
