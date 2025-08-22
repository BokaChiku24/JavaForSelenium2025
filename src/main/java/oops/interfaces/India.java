package oops.interfaces;

public class India implements CentralTraffic, ContinentalTraffic{
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
        objIndia.trainSymbol();
        objIndia.busSymbol();
    }

    @Override
    public void trainSymbol() {
        System.out.println("Train symbol is here");
    }

    @Override
    public void busSymbol() {
        System.out.println("Bus symbol is here");
    }
}
