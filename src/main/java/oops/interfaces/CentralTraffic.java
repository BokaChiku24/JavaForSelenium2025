package oops.interfaces;

public interface CentralTraffic {
    public static final int fine = 1000;
    public abstract void greenGo();
    public abstract void redStop();
    public abstract void yellowSlow();
    default void rule(){
        System.out.println("Please follow the traffic rules. This is default!!");
        trafficOfficer();
    }
    private void trafficOfficer(){
        System.out.println("Traffic officer confidential information..");
    }
    public static void display(){
        System.out.println("This is static method of the interface!!");
    }
}
