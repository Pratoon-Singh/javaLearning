package linearSearch;

public class LinearSearchMaximum {
    public static void main(String[] args) {
        int [] num = {18, 12 ,9, 14 , 77 , 50};
        System.out.println(linearSearchMaximum(num));
    }

    static int linearSearchMaximum(int[] arr){

        int intialElement = arr[0];

        for (int i = 1 ; i<arr.length; i++){
            if(arr[i]>intialElement)
                intialElement =arr[i];
        }
        return intialElement;
    }
}
