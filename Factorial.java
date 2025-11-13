import java.util.Scanner;

public class Factorial {

    static int Fact(int n){
        int res = 1;
        for(int i = 2; i <= n; i++){
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(Fact(n));
    }
}
