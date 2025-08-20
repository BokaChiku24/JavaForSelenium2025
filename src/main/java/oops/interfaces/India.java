package oops.interfaces;

public class India implements CentralTraffic{
    @Override
    public void greenGo() {
        System.out.println("Please go..");
    }

    @Override
    public void redStop() {
        System.out.println("Please stop..");
    }

    @Override
    public void yellowSlow() {
        System.out.println("Please watch and go..");
    }

    public static void main(String[] args) {
        CentralTraffic obj = new India();
        // default method (Within default interface private method is used)
        obj.rule();
        // Calling static method
        CentralTraffic.display();
        India objIndia = new India();
        objIndia.greenGo();
        objIndia.yellowSlow();
        objIndia.redStop();
    }
}
