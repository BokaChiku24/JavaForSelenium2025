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
        for (int[] row : array2) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }

        /*
        for(int i = 0; i < array2.length; i++){
            for (int j = 0; j < array2.length; j++){
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
         */

        System.out.println("----------------------------------");

        int[][] a = new int[2][3];
        a[0][0] = 2;
        a[0][1] = 4;
        a[0][2] = 5;
        a[1][0] = 3;
        a[1][1] = 8;
        a[1][2] = 0;
        for(int[] row: a){
            for(int num: row){
                System.out.print(num + " \t");
            }
            System.out.println();
        }
    }

}
