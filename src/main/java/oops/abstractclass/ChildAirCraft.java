package oops.abstractclass;

public class ChildAirCraft extends ParentAirCraft{
    @Override
    public void body() {
        System.out.println("Body color is red..");
    }

    public static void main(String[] args) {
        ParentAirCraft obj = new ChildAirCraft();
        obj.body();
        obj.engine();
        obj.safetyGuidelines();
    }
}