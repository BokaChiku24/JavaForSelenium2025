package selenium.java.basics.condition.loop;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i < 30);

        System.out.println("------------------------------");

        i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i > 30);

    }
}
