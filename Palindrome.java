import java.util.Scanner;

public class Palindrome {

    static boolean isPal(int n) {
        int rev = 0;
        int temp = n;

        while (temp != 0) {
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp / 10;
        }

        return rev == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(isPal(n));
    }
}
