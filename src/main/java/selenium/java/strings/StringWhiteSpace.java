package selenium.java.strings;

public class StringWhiteSpace {
    public static void main(String[] args) {
        String string = "    Yes";
        System.out.println(string.trim());
        String str = "Yes     ";
        System.out.println(str.trim());
    }
}
