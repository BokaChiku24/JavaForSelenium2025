package selenium.java.basics.array;

public class SmallNumber {
    public static void main(String[] args) {
        int[][] array = {{2,4,7},{1,6,5},{8,0,9}};
        int minNumber = array[0][0];
        for(int i = 1; i < array.length; i++){
            for(int j = 1; j < array.length; j++){
                if(array[i][j]<minNumber)
                    minNumber = array[i][j];
            }
        }
        System.out.println("Minimum number is: " + minNumber);

        System.out.println("------------------------------------------");
        int maxNumber = array[0][0];
        for(int i = 1; i < array.length; i++){
            for(int j = 1; j < array.length; j++){
                if(array[i][j]>maxNumber)
                    maxNumber = array[i][j];
            }
        }
        System.out.println("Maximum number is: "+ maxNumber);
    }
}
