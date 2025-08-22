package oops.polymorphism.overload;

public class OverLoading {
    public void getData(int a) {
        System.out.println(a);
    }

    public void getData(String a) {
        System.out.println(a);
    }

    public void getData(int a, int b) {
        System.out.println(b);
    }

    public static void main(String[] args) {
        OverLoading cl = new OverLoading();
        cl.getData(2);
        cl.getData("hello");
        cl.getData(2, 5);
    }
}
