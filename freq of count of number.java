import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i,n,j,temp;
        System.out.print("enter the size: ");
        
        n=in.nextInt();
        
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;
        
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
            if(arr[i]>=max)
            max = arr[i];
        }
        
        int freq[] = new int[max+1];
        for(i=0;i<n;i++){
            freq[arr[i]]++;
        }
        
        for(i=0;i<freq.length;i++){
            if(freq[i]!=0){
                System.out.println("occurs "+i+"times "+freq[i]);
            }
        }
       
        
    }
}