import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for number of pairs (n)
        System.out.print("Enter the number of pairs: ");
        int n = sc.nextInt();

        // Declaring the 2D array
        int[][] arr = new int[n][2];

        // Taking user input for the pairs
        System.out.println("Enter the pairs (two numbers per pair): ");
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        // Finding and printing symmetric pairs
        System.out.println("The symmetric pairs are: ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] == arr[i][1] && arr[j][1] == arr[i][0]) {
                    System.out.print("(" + arr[i][1] + " " + arr[i][0] + ")" + " ");
                    break;
                }
            }
        }
    }
}
