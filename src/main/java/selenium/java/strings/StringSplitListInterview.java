package selenium.java.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSplitListInterview {
    public static void main(String[] args) {
        String string = "Java/Learning/Selenium";
        String[] strings = string.split("/");
        for(String name : strings){
            System.out.println(name);
        }
        List<Object> list = new ArrayList<Object>();
        list = Arrays.asList(strings);
        System.out.println(list);

        Object[] array = list.toArray();
        for (Object object: array){
            System.out.println(object);
        }
    }
}
