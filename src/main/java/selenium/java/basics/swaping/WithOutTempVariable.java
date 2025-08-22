package selenium.java.basics.swaping;

public class WithOutTempVariable {
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;
        num1 = num2 + num1;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("First number is: " + num1);
        System.out.println("Second number is: " + num2);
    }
}
