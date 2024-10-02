import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n=in.nextInt();
        int i,j,k;
        
        int arr[] = new int[n];
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        
        int d[] = new int[n];
        int ct=0;
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    for(k=0;k<ct;k++){
                        if(d[k]==arr[i]){
                            break;
                        }
                    }
                    if(k==ct){
                        d[ct++]=arr[i];
                        System.out.print("The Dupilcate Values: "+arr[i]);
                    }
                }
            }
        }
        
    }
}
// using sorting

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n=in.nextInt();
        int i,j,k;
        
        int arr[] = new int[n];
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        
        Arrays.sort(arr);
        
        for(i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                if(i==0 || arr[i]!=arr[i-1]){
                    System.out.print(+arr[i]+" ");
                }
            }
        }
        
    }
}