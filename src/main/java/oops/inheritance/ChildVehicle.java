package oops.inheritance;

public class ChildVehicle extends ParentVehicle {

    public String colour(){
        return super.colour = "Blue";
    }

    public void gear() {
        System.out.println("This is the child class gear method");
    }

    public void breaks() {
        System.out.println("This is the child class break code..");
    }

    public void audioSystem() {
        System.out.println("This is the child class audio system code..");
    }

    public void speed() {
        System.out.println("This is the child class speed code..");
    }

    public static void main(String[] args) {
        ChildVehicle object = new ChildVehicle();
        System.out.println("New colour of the vehicle is: " + object.colour());
        object.gear();
        object.breaks();
        object.audioSystem();
        object.speed();
    }
}
