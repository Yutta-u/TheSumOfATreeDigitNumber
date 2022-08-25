import java.util.Scanner;

public class TheSumOfATreeDigitNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = a / 100;
        int c = a / 10;
        int c1 = c % 10;
        int d = a % 10;
        int x = b + c1 + d;
        System.out.println(x);
    }
}
