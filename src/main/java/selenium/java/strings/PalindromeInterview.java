package selenium.java.strings;

public class PalindromeInterview {
    public static void main(String[] args) {
        String string = "Madam";
        StringBuilder reverse = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse.append(string.charAt(i));
        }
        if (string.equalsIgnoreCase(reverse.toString())) {
            System.out.println("Palindrome string is: " + string);
        } else {
            System.out.println("Not palindrome string is: " + string);
        }
    }
}
