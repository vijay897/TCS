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
        
        if(n%2==0){
            int d1 = (n/2)-1;
            int d2 = (n/2);
            
            System.out.print((double)(arr[d1]+arr[d2])/2);
        }else{
            System.out.print((double)(arr[n/2]));
        }
    }
}