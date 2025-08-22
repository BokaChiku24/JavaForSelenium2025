package selenium.java.basics.swaping;

public class WithTempVariable {
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("First number is: " + num1);
        System.out.println("Second number is: " + num2);
    }
}
