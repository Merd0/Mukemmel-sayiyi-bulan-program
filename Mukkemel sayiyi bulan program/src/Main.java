import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int n = inp.nextInt();
        int result = 0;
        for (int i = 1; i < n ; i++ ) {
            if ( n % i == 0 ) {
              result += i;
            }

        } if (result == n) {
            System.out.print( n + " Mükemmel sayıdır");
        } else {
            System.out.print(n + " Mükemmel sayı değildir");
        }


    }
}