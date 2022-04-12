import java.util.Scanner;

public class VladAndCandies {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        for (int j = 0; j < testCases; j++) {
            int tipesOfCandies = scanner.nextInt();
            scanner.nextLine();
            int[] candies = new int[tipesOfCandies];

            String amountOfCandies = scanner.nextLine();
            String[] strs = amountOfCandies.trim().split(" ");
            for (int i = 0; i < tipesOfCandies; i++) {
                candies[i] = Integer.parseInt(strs[i]);
            }

            if (tipesOfCandies == 1 && candies[0] > 1) {
                System.out.println("NO");
                continue;
            }

            int[] maxs = buscarMax(candies);
            boolean cont = true;
            while(cont) {
                maxs[0]--;
                candies[maxs[1]]--;
                if (maxs[0] < 2) {
                    System.out.println("YES");
                    cont = false;
                    continue;
                }

                if (maxs[0] > maxs[2]) {
                    System.out.println("NO");
                    cont = false;
                    continue;
                } else if (maxs[0] == maxs[2]) {
                    int tmp = maxs[0];
                    maxs[0]=maxs[2];
                    maxs[2]=tmp;
                } else {
                    maxs = buscarMax(candies);
                }
            }
        }
    }

    public static int[] buscarMax(int[] candies) {
        int[] maxs = new int[4];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] >= maxs[0]) {
                maxs[3] = maxs[1]; // maxs[3] Index of 2nd biggest maxs[1] index of current Max
                maxs[2] = maxs[0]; // maxs[2] value of 2nd biggest maxs[0] value of current Max
                maxs[1] = i;
                maxs[0] = candies[i];
            } else if (candies[i] >= maxs[2]) { //Could happen than number is bigger than 2nd but not than max
                maxs[3] = i;
                maxs[2] = candies[i];
            }
        }
        return maxs;
    }
}
