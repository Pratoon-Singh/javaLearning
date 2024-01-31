import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Counting_occurences {
    public static void main(String[] args) {
        long number = 197391283971937192L;
        int occurenceOf = 7;
        getcount(number,occurenceOf);

    }

    public static void getcount(long number, int occurenceOf){
        int count = 0;
        while(number>0){
            long lastdigit = number%10;
            if(lastdigit==occurenceOf){
                count++;

            }
            number = number/10;

        }
        System.out.println(count);
    }

}
