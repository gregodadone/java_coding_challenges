import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;


public class PrimeOrNot {
    //Write a Java program to determine whether a number is prime or not
    //O(n*log(n))
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        int n = sc.nextInt();

        System.out.println("Enter your numbers...");
        int tmp;
        List<Integer> primes = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            tmp = sc.nextInt();
            if (isPrime(tmp)) {
                primes.add(tmp);
            }
        }

        System.out.println(primes.toString());
    }

    private static boolean isPrime(int number) {
        return number > 1 &&
                IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(n -> number % n == 0);
    }
}
