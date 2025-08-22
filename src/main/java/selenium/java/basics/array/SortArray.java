package selenium.java.basics.array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {-1, 2, 5, 0, 9, 3, 3, 1, 8, 10, 100, 13};
        Arrays.sort(array);
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i] + "\t");
        }
    }
}
