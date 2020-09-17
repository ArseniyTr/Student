package practice;
import java.util.Scanner;
public class pr5 {
    static int sum=0;
    public static int recursion(int n) {
        if (n == 0) {
            return sum;
        }
        sum+=n%10;
        return recursion(n/10) ;
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
    int k=scan.nextInt();
    System.out.println(recursion(k));
    }
}
