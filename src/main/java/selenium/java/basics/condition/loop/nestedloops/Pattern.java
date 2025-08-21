package selenium.java.basics.condition.loop.nestedloops;

public class Pattern {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j = j + 1) {
                System.out.print(num + " \t");
                num++;
            }
            System.out.println();
        }

        System.out.println("------------------------------------");

        int k = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " \t");
                k++;
            }
            System.out.println();

        }

        System.out.println("------------------------------------");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " \t");
            }
            System.out.println();
        }

        System.out.println("------------------------------------");
        int a = 3;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " \t");
                a = a + 3;
            }
            System.out.println();
        }


    }
}
