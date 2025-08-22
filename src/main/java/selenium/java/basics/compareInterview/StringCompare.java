package selenium.java.basics.compareInterview;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1==str2); // It compare reference not value
        System.out.println(str1.equals(str2)); // It compares value
        String str3 = new String("Hello");
        System.out.println(str1==str3);// It compares reference not value and return false
        System.out.println(str1.equals(str3)); // It compares value and return true
    }
}