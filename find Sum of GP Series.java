import java.util.Scanner;
class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        double a, r, sum = 0;
        int n, i;
        
        // Corrected input prompts
        System.out.print("Enter the first term: ");
        a = in.nextDouble();  // Use nextDouble for first term input
        
        System.out.print("Enter the common ratio: ");
        r = in.nextDouble();  // Use nextDouble for common ratio input
        
        System.out.print("Enter the number of terms (n): ");
        n = in.nextInt();  // This is fine since 'n' is an integer
        
        // Calculate the sum of the G.P. series
        for(i = 0; i < n; i++) {
            sum += a;
            a = a * r;
        }
        
        System.out.println("Sum of the G.P. series: " + sum);
    }
}
