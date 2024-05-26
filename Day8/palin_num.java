import java.util.*;
public class palin_num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int rev=0;
        int n1=n;
        while(n>0)
        {
        int last=n%10;
        rev=(rev*10)+last;
        n=n/10;
        }
        if(n1==rev)
        {
            System.out.println("palin");
        }
        else
        {
            System.out.println("not palin");
        }
    }
}