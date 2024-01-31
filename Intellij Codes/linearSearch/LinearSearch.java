package linearSearch;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        // Find whether 14 exists or not in the given array using linear search
        int [] nums = {18, 12 ,9, 14 , 77 , 50};
        int ans = linearSearch(nums,33);
        System.out.println(ans);

        int ans2 = linearSearchElement(nums,18);
        System.out.println(ans2);

        int [] num = {18, 12 ,9, 14 , 77 , 50,-1};
        boolean ans3 = linearSearchBoolean(num,-1);
        System.out.println(ans3);
        }

       

        static int linearSearch(int[] arr , int target){
            //search the item in the array and return index if found
            // if not found return -1
            if(arr.length==0){
                return -1;
            }
            // run a for loop
            for(int index = 0 ; index<arr.length;index++){
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

    static int linearSearchElement(int[] arr , int target){
        
        // Search the target and return the element
        if(arr.length==0){
            return -1;
        }
        // run a for loop
        for (int element : arr) {
            //check for element at every index if it is = target
            if (element == target) {
                return element;
            }
        }
        // this line will be executed if none of the target value is found
        // hence target not found
        return -1;
    }

    static boolean linearSearchBoolean(int[] arr , int target){

        // Search the target and return the boolean value
//        there can be a case where -1 can be the target value
        if(arr.length==0){
            return false;
        }
        // run a for loop
        for (int element : arr) {
            //check for element at every index if it is = target
            if (element == target) {
                return true;
            }
        }
        // this line will be executed if none of the target value is found
        // hence target not found
        return false;
    }


    }
