package selenium.java.basics.condition.ifelse;

public class IfElse {
    public static void main(String[] args) {
        if (5 > 2) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }

        for (int i = 0; i < 10; i = i + 2) {
            if (i == 8)
                System.out.println("8 is found");
            else
                System.out.println("8 is not found");
        }
    }
}
