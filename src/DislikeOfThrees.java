import java.util.Scanner;

public class DislikeOfThrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        short[] k = new short[1000];

        short idx = 0;
        short current = 0;
        while (idx < 1000) {
            if (current % 3 == 0 || current % 10 == 3) {
                current++;
                continue;
            }
            k[idx++]=current++;
        }

        byte t = sc.nextByte();
        for (byte i = 0; i < t; i++) {
            System.out.println(k[sc.nextShort()-1]);
        }
    }
}
