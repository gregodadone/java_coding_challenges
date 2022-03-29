import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeOrNot2 {
    //Write a Java program to determine whether a number is prime or not
    //O(n*log(n))
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        int n = sc.nextInt();

        System.out.println("Enter your numbers...");
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int[] primes = Arrays.stream(numbers).filter(PrimeOrNot2::isPrime).toArray();

        System.out.println(Arrays.toString(primes));
    }

    private static boolean isPrime(int number) {
        return number > 1 &&
                IntStream.rangeClosed(2, (int) Math.sqrt((double) number)).noneMatch(n -> number % n == 0);
    }
}
