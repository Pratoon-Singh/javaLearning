package linearSearch;

import java.util.Arrays;

public class LinearSearchInRange {
    public static void main(String[] args) {
        int [] num = {18, 12 ,9, 14 , 77 , 50};
        System.out.println(linearSearchInRange(1,4, num , 50));
    }


    // to search in range
    //Q find the target i.e 3 at index [1,4]

    static int linearSearchInRange(int start, int end ,int[] arr , int target){
        //search the item in the array and return index if found
        // if not found return -1
        if(arr.length==0){
            return -1;
        }
        // run a for loop
        for(int index = start ; index<end;index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        // this line will be executed if none of the target value is found
        // hence target not found
        return -1;
    }

}
