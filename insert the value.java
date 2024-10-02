import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n=in.nextInt();
        int i,val;
        
        int arr[] = new int[n+1];
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        
        System.out.print("enter the value to insert: ");
        val=in.nextInt();
        
        for(i=n-1;i>=0;i--){
            arr[i+1] = arr[i];
        }
        arr[0] = val;
        
        for(i=0;i<=n;i++){
            System.out.print(arr[i]);
        }
    }
}

// Inserting at end 

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n=in.nextInt();
        int i,val;
        
        int arr[] = new int[n+1];
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        
        System.out.print("enter the value to insert: ");
        val=in.nextInt();
        
       
        arr[n] = val;
        
        for(i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

// Inserting at any position in the array

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n=in.nextInt();
        int i,val;
        
        int arr[] = new int[n+1];
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        
        System.out.print("enter the element in the position: ");
        int pos = in.nextInt();
        
        System.out.print("enter the value to insert: ");
        val=in.nextInt();
        
       for(i=n-1;i>=pos;i--){
           arr[i+1]=arr[i];
       }
        arr[pos] = val;
        
        for(i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}