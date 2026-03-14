import java.util.*;
class Armstrong
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number check whether it is Armstrong:");
      int num =sc.nextInt();
      int temp= num;
      int sum=0;
      int digits= String.valueOf(num).length();
    while(num!=0)
    {
        int lastdigit=num%10;
        sum += Math.pow(lastdigit, digits);
        num=num/10;
    }
      System.out.println((temp==num)?" it is armstrong":"it is not armstrong"); 
    }
}