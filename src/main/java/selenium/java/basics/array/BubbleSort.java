package selenium.java.basics.array;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 6, 1, 7, 9, 0, -10, 19, -1};
        BubbleSort.bubble(numberArray);
    }
    public static void bubble(int[] numberArray){
        for(int i = 0; i < numberArray.length; i++){
            for(int j = i+1; j< numberArray.length; j++){
                if(numberArray[i] > numberArray[j]){
                    int temp = numberArray[i];
                    numberArray[i] = numberArray[j];
                    numberArray[j] = temp;
                }
            }
        }
        for(int num : numberArray){
            System.out.print(num+ "\t");
        }
    }
}
