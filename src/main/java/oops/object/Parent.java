package oops.object;

public class Parent {
    public static void main(String[] args){
        // Creating an object of child class to call the non-static method.
        Child obj = new Child();
        obj.display();

        // Creating an object of the parent class to call the non-static method
        Parent parentObj = new Parent();
        parentObj.parentDisplay();
    }

    public void parentDisplay(){
        System.out.println("This is the parent display method");
    }
}
