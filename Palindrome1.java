import java.util.Scanner;
class Palindrome1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number whether it is palindrome or not");
        int num =sc.nextInt();
        int temp = num;
        int rev= 0;
        while(num!=0)
        {
            int lastdigit = num%10;
            rev = rev *10+lastdigit;
            num=num/10;
        }
        System.out.println((temp==rev)?"it is palindrome":"it is not palindrome");
    }

}