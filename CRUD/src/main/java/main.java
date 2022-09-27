import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        System.out.println("AAAAAAAAAA");
//        String str = "";
//        String str2;
//        List<String> lst = new ArrayList<>();
//        boolean flag1 = false;
//        boolean flag2 = false;
//        Boolean flag3 = null;
//
//        System.out.println(flag1);
//        System.out.println(flag2);
//        System.out.println(flag3);
//
//        boolean x = flag1 != true ? x = true : false;
        System.out.println(FizzBuzz(6));
        System.out.println("Enter number");
        Scanner myobj = new Scanner(System.in);
        int ourobj = myobj.nextInt();
        System.out.println(primenum(ourobj));
        }



    static boolean primenum(int x){
        int ans = 0;
            if (x < 2){
                return false;
            }
            else if (x == 2){
                return true;
            }
            for (int y = 2; y<x ; y++){
                if (x%y == 0){
                    return false;
                }
            }
            return true;
    }

    static String FizzBuzz(int x) {
        for (int i = 1; i < x; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    return "FizzBuzz";
                }
                return "Fizz";
            }
            if (i % 5 == 0) {
                return "Buzz";
            }
            else {
                return Integer.toString(i);
            }

        }
    return "Exit code 1";
    }
}
