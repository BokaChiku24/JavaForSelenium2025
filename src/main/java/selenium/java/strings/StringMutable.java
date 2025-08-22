package selenium.java.strings;

public class StringMutable {
    public static void main(String[] args) {

        // StringBuffer is thread-safe, and it is synchronized.
        // It slower than StringBuilder
        StringBuffer string = new StringBuffer("Hello");
        StringBuffer str = new StringBuffer("Hello");
        string.append(" Rahul");
        System.out.println(string); // It will print Hello Rahul

        // StringBuilder is not thread-safe, and it is not synchronized.
        // It faster than StringBuffer
        StringBuilder str1 = new StringBuilder("Hello");
        StringBuilder str2 = new StringBuilder("Hello");
        str1.append(" Rahul");
        System.out.println(str1);
        str2.insert(5, " Rahul");
        System.out.println(str2);
        str2.replace(2, 5, "k");
        System.out.println(str2);
        str2.deleteCharAt(4);
        System.out.println(str2);



    }
}
