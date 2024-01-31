import java.util.Scanner;

public class SalaryAns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int salary = scan.nextInt();
        scan.close();
        if(salary>10000){
            int final_salary= salary+2000;
            System.out.println(final_salary);
        }else {
            System.out.println(salary+1000);

        }


    }
}
