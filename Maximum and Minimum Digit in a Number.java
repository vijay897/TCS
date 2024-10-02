import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
       System.out.print("enter the number: ");
       int num = in.nextInt();
       
       int lar = -1;
       int small = 9;
       int temp = num;
       while(temp>0){
           int digit = temp%10;
           
           if(digit>lar){
               lar = digit;
           }
           if(digit<small){
               small = digit;
           }
           temp/=10;
       }
       System.out.println(lar);
       System.out.print(small);
    }
}