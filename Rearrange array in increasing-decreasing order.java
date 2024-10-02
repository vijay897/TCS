
//Problem Statement: Rearrange the array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order

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
        Arrays.sort(arr);
        
        for(i=0;i<n/2;i++){
            System.out.print(arr[i]+" ");
        }
        for(i=n-1;i>=n/2;i--){
            System.out.print(arr[i]+" ");
        }
    }
}