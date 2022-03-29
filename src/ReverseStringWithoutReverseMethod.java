import java.util.Scanner;

public class ReverseStringWithoutReverseMethod {

    //Write a Java program to reverse a string without using the reverse method of Java's String class
    //Complexity O(n)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to reverse:");
        String st = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = st.length() - 1; i >= 0; i--) {
            sb.append(st.charAt(i));
        }
        sc.close();

        System.out.println(sb.toString());
    }
}
