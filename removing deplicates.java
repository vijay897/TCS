
// using sorting the array

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i;
        
        int arr[] = new int[n];
        for(i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        
        Arrays.sort(arr);
        
        int j=0;
        for(i=0;i<n-1;i++){
            if(arr[i] != arr[i+1]){
            arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[n-1];
        
        for(i=0;i<j;i++){
            System.out.print(arr[i]);
        }
    }
}

//without using sorting

import java.util.*;
import java.util.HashSet;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i;
        
        int arr[] = new int[n];
        for(i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        
        HashSet<Integer> unqueElement = new HashSet<>();
        
        for(i=0;i<n;i++){
            unqueElement.add(arr[i]);
        }
        for(int ele:unqueElement){
            System.out.print(ele);
        }
        
    }
}

