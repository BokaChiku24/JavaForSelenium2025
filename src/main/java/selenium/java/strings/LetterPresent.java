package selenium.java.strings;

public class LetterPresent {
    public static void main(String[] args) {
        String string = "Payment $100 paid";
        String str = new String("Payment $100 paid");
        char ch = string.charAt(8);
        System.out.println(ch=='$'?"$ is available":"$ is not available");
        String str1 = new String("Payments $100 paid");
        int dollarPosition = str1.indexOf('$');
        if(dollarPosition==9){
            System.out.println("$ is at 9th correct position if the plural payments");
        }else{
            System.out.println("$ is at 8th position because plural payments not found");
        }

    }
}
