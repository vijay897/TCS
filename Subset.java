import java.util.Scanner;
class Main{
    public static  void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count=0;
        System.out.print("enter the arr1 size: ");
        int n1 = in.nextInt();
        
        System.out.print("enter the arr2 size: ");
        int n2 = in.nextInt();
        
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        
        for(int j = 0;j<n1;j++){
            arr1[j] = in.nextInt();
        }
        
        for(int j=0;j<n2;j++){
            arr2[j] = in.nextInt();
        }
        
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j])
                count++;
            }
        }
        if(count==n2)
        System.out.print("Ok");
        else
        System.out.print("Not");
    }
}