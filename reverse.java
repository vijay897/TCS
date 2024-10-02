import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i,n;
        System.out.print("enter the size: ");
        n=in.nextInt();
        int arr[] = new int[n];
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(i=(n-1);i>=0;i--){
            System.out.print(arr[i]);
        }
        
    }
}