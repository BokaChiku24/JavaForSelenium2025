package selenium.java.strings;

public class PrintStringReverseLoginInterviewer {
    public static void main(String[] args) {
        String string = "Rahul";
        for(int i = string.length()-1; i >=0 ; i--){
            System.out.print(string.charAt(i));
        }
        System.out.println();
        System.out.println("--------------------------------");

        char[] charArray = string.toCharArray();
        for(int i = charArray.length; i> 0 ; i--){
            System.out.print(charArray[i-1]);
        }

        System.out.println();
        System.out.println("--------------------------------");

        StringBuffer stringBuffer = new StringBuffer(string);
        System.out.println(stringBuffer.reverse());

        System.out.println();
        System.out.println("--------------------------------");

        String str = "Java/Learning/Selenium";
        String[] strings = str.split("/");
        for(int i = strings.length-1; i>=0; i--){
            System.out.print(strings[i] + "\t");
        }
    }
}
