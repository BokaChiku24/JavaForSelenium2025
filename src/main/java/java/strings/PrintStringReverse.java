package java.strings;

public class PrintStringReverse {
    public static void main(String[] args) {
        String string = new String("Hello World!!");
        for(int i = string.length()-1; i >= 0; i--){
            System.out.print(string.charAt(i));
        }
        System.out.println("\n" + "----------------------------------");
        System.out.println(PrintStringReverse.stringReverse("My name is Tom..."));
        System.out.print("----------------------------------" + "\n");
        boolean flag = PrintStringReverse.isPalindromeString("MADAM");
        System.out.println(flag==true?"It is palindrome string":"It is not palindrome string");
    }

    public static String stringReverse(String reverse){
        StringBuffer stringBuffer = new StringBuffer(reverse);
        return stringBuffer.reverse()+"";
    }

    public static boolean isPalindromeString(String str){
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        if(reverse.equals(str)){
            return true;
        }else{
            return false;
        }
    }
}
