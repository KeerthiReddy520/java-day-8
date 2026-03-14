import java.util.*;
class Reverse1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String:");
        String str=sc.nextLine();
        String reversed=" ";
        for (int i=str.length()-1;i>=0;i--)
        {
            reversed=reversed+str.charAt(i);
        }
        System.out.println("reversed="+ reversed);
    }
}