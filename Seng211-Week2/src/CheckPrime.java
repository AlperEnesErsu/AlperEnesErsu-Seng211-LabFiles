import java.util.Scanner;

public class CheckPrime {
    static void main() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = kb.nextInt();

        if (isPrime(number)){
            System.out.println(number + " is a prime number.");
        }else{
            System.out.println(number + " is not a prime number;");
        }
    }

    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i=2;i<=n/2;i++){
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
