public class Reverse_Number {
    public static void main(String[] args) {
        int a = 12345;
        int final_res = 0;
//        answer :- 54321
        while (a > 0) {
            int result = a % 10;
            a/=10;
            final_res = final_res * 10 + result;
        }
        System.out.println(final_res);
    }
}