import java.lang.reflect.Array;
import java.util.Arrays;

public class PassingNumbers
{
    public static void main(String[] args) {


        int [] num = {23,24,53,83};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
        String name ="Pratoon";
        System.out.println(
                name
        );
        nameChange(name);
        System.out.println(name);

    }
    static void change (int [] arr)     {
        arr[0]=99;

    }
    static void nameChange(String naam){
        naam = "pratoon";
    }
}

