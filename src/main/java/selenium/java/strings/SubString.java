package selenium.java.strings;

public class SubString {
    public static void main(String[] args) {
        String str = new String("Payment $100 paid");
        System.out.println(str.substring(8));
        System.out.println(str.substring(9,12));
    }
}
