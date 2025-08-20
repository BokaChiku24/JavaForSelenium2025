package selenium.java.basics.method.withoutreturn;

public class WithoutReturn {
    public static void main(String[] args) {
        WithoutReturn obj = new WithoutReturn();
        obj.display();
    }

    // void is used to not return anything
    public void display(){
        System.out.println("Hello world..");
    }
}
