package selenium.java.basics.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultidimensionalArray {

    public static void main(String[] args) throws IOException {
        int[][] array = new int[3][3];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter 9 numbers: ");
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = Integer.parseInt(bufferedReader.readLine());
            }
        }
        System.out.println("Now print the matrix..");
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        bufferedReader.close();
        System.out.println();
        System.out.println("----------------------------------");
        int [][] array2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        for(int i = 0; i < array2.length; i++){
            for (int j = 0; j < array2.length; j++){
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
