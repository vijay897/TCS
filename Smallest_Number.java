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
        int smallest=arr[0];
        for(i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.print("the smallest number "+smallest);
    }
}