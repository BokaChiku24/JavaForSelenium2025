package selenium.java.basics.method.withreturn;

public class Return {
    public static void main(String[] args) {
        Return obj = new Return();
        System.out.println("Display method return this message:" + obj.display());
        System.out.println(obj.addition());
    }

    // provide data type, class name, arrays to return
    public String display(){
        return " Hello world..";
    }

    public int addition(){
        System.out.print("Please provide two numbers: ");
        return 10;
    }
}
