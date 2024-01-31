package linearSearch;

import java.util.Arrays;

public class LinearSearchInString {
    public static void main(String[] args) {

        String name = "Pratoon";
        char target = 'n';
        System.out.println(searchInString(name,target));
        System.out.println(searchInStringForEach(name,target));
        System.out.println(Arrays.toString(name.toCharArray())); // it convert string to char arrayLinearSearchInString
    }

    static boolean searchInString(String search, char target){

        if (search.length()== 0)
            return false;

        for(int i =0; i<search.length();i++){
            char element = search.charAt(i);
            if(element==target){
                return true;
            }
        }
        return false;
    }

    static boolean searchInStringForEach(String search, char target){

        if (search.length()== 0)
            return false;

        for(char ch : search.toCharArray()){
            if (target==ch){
                return true;
            }
        }
        return false;
    }
}
