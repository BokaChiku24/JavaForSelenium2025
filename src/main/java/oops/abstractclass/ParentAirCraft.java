package oops.abstractclass;

public abstract class ParentAirCraft {

    public void engine(){
        System.out.println("Engine guidelines");
    }

    public void safetyGuidelines(){
        System.out.println("Follow guidelines");
    }

    public abstract void body();
}
