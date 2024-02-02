package java100Days;

import java.util.ArrayList;

public class day_01_VarKeyword {

    // var keyword in java
    /*
    the var keyword can only be used to create local variable
    You need to explicitly intialize var before the use.
    var variable can even store string values.
     */
    public static void main(String[] args) {
        //Using var as a local variable in method
        varExample();
    }
        static void varExample(){
        var id = "Pratoon";
            System.out.println(id);
        }

        /*
    static void varExample2(){
        // this code will give compilation error;
        var id ;
        id = 20;
        System.out.println(id);
    }

         */

    /*
    var variable can even be used as a refrence variable!
    static void varExample3(){
        var animal = new Animal();
        System.out.println(animal.walks());
    }


    Same var variable cannot be used to refer to another object!
    static void varExample4(){
        var id = new Animal();
        id.walks();
        id = new Banks();
    }

    */

    //A war can be used as both reference as well as generis for a collection
//
//    static void varExampl5(){
//        var<var> al = new ArrayList<>();
//        al.add (10);
//        System.out.println(al);
//   }
   /*
   A var cannot be used as a return type nor as a argumnet to method

    static void varExample6(var animal){

        System.out.println(animal);
    }
    static void varExample3(){
        var sum = 10+12;
        System.out.println(sum);
    }
    */

}
