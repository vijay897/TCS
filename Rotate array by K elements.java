import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input for the number of elements in the array
        int n, i;
        System.out.print("Enter the number of elements in the array: ");
        n = in.nextInt();

        int arr[] = new int[n];

        // Input for array elements
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Input for the number of rotations
        System.out.print("Enter the number to shift: ");
        int k = in.nextInt();

        // Create a temporary array to hold the last k elements
        int temp[] = new int[k];

        if (n > 0) {
            k = k % n; // Handle cases where k > n
            if (k <= n) {
                // Copy last k elements into temp array
                for (i = n - k; i < n; i++) {
                    temp[i - (n - k)] = arr[i];
                }

                // Shift the remaining elements to the right
                for (i = n - k - 1; i >= 0; i--) {
                    arr[i + k] = arr[i];
                }

                // Copy the elements from temp back into the start of the array
                for (i = 0; i < k; i++) {
                    arr[i] = temp[i];
                }
            }
        }

        // Print the rotated array
        System.out.println("Array after rotation:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
