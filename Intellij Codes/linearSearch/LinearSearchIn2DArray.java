package linearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
    int [] [] num = {
                    {1,2,3,4,5,6},

                    {18, 12 ,9, 14 , 77 , 50}
                    };
        System.out.println(Arrays.deepToString(num)) ;// To print the 2d array we use deepToString
        int[] ans = linearSearch2dArray(num,50);
        System.out.println(Arrays.toString(ans));
        System.out.println(linearSearch2dArrayMaximum(num));
        System.out.println(linearSearch2dArrayMinimum(num));

    }

    static int[] linearSearch2dArray(int [][] arr, int target){

        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{};
    }

    static int linearSearch2dArrayMaximum(int [][] arr){
         int max = arr[0][0];
         // int max = Interger.MinValue
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col] >max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    static int linearSearch2dArrayMinimum(int [][] arr){
        int min = arr[0][0];
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }

}
