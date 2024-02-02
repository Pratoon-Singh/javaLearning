package java100Days;

public class day_02_StringNullCheck {

    public static void main(String[] args) {

        nullStringCheck("zxzxzxzx");
    }

    static void nullStringCheck(String  param){
        if(param != null && !param.isEmpty())
            System.out.println("The passed parameter is : -"+param);
        else System.out.println(" Empty Parameter Passed" );
    }

}


