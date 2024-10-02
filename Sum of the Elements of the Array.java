
//sum of array elements

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n=in.nextInt();
        
        int i;
        int arr[] = new int[n];
        
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int sum=0;
        for(i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.print(sum);
    }
}