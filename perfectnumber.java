import java.util.Scanner;
class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int n1,temp,sum=0;
        System.out.print("enter the 1 number: ");
        temp = in.nextInt();
        
        n1 = temp;
        for(int i=1;i<n1;i++){
            if(n1%i==0){
                sum+=i;
            }
        }
        if(temp == sum)
        System.out.print("ok");
        else
        System.out.print("not");
       
        
    }
}


// n and m ranging perfect number: 

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int n1,n2,i,j;
        System.out.print("enter the 1 number: ");
        n1 = in.nextInt();
        System.out.print("enter the 2 number: ");
        n2 = in.nextInt();
        
        for(i=n1;i<n2;i++){
            int sum=0;
            int num=i;
            for(j=1;j<i;j++){
                if(i%j==0){
                    sum=sum+j;
                }
            }
            if(sum==num)
            System.out.print(i+" ");
            
        }
    }
}
