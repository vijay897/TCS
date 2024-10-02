import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Taking user input for array size
        System.out.print("Enter the number of elements in the array: ");
        int n = in.nextInt();

        // Declaring the array
        int[] arr = new int[n];

        // Taking user input for array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Calculating and printing ranks
        for (int i = 0; i < n; i++) {
            int count = 0;
            // Iterate through the array to count how many numbers are smaller than arr[i]
            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[i]) {
                    count++;
                }
            }
            int rank = count + 1;
            System.out.print(rank + " ");
        }
    }
}
