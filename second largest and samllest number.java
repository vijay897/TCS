import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i,n,j,temp;
        System.out.print("enter the size: ");
        n=in.nextInt();
        int arr[] = new int[n];
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int smallest=arr[0];
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.print(arr[0]);
        System.out.print(arr[n-2]);
    }
}