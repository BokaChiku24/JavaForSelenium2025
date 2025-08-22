package selenium.java.strings;

public class StringDeclaration {
    // String: It iss one of the pre-build class in Java
    // 1. String Literals
    String string = "Hello"; // String Literal
    String string1 = "Hello"; // Java check the string pool for the same value.
    // if the same value finds then java will not create new object. in this case it will map to string
    // 2. By creating an object of the class
    String str = new String("Hello");
}
