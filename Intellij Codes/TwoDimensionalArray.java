import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {


    public static void main(String[] args) {
        int [] [] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        for (int i = 0 ; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j]= in.nextInt();
            }
            System.out.println();
        }
for (int i = 1; i< arr.length;i++){
        System.out.println(Arrays.toString(arr[i]));
    }
    }
    // int arr [] [] array  = new array [3]<- denotes roe of 2d array  [] column


}
