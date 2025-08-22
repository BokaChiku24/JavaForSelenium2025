package selenium.java.strings;

public class StringImmutable {
    public static void main(String[] args) {
        String string = "Hello";
        String string2 = "Hello";
        string.concat(" Rahul");
        System.out.println(string); // It will print Hello
    }
}
