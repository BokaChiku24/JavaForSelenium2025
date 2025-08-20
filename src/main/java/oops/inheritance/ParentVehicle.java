package oops.inheritance;

public class ParentVehicle {
    String colour = "Red";
    public void gear(){
        System.out.println("This is gear code..");
    }

    public void breaks(){
        System.out.println("This is break code..");

    }

    public void audioSystem(){
        System.out.println("This is audio system code..");

    }

    public static void main(String[] args) {
        ParentVehicle object = new ParentVehicle();
        System.out.println("Vehicle colour is: " + object.colour);
        object.gear();
        object.breaks();
        object.audioSystem();
    }
}
