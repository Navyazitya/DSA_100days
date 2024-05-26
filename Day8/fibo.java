import java.util.*;
class fibo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many num: ");
        int n=sc.nextInt();
        int first=0,second=1,third=0;
        System.out.println("Fibonacci series: ");
        System.out.println(first+" ");
        System.out.println(second+" ");
        for(int i=2;i<n;i++)
        {
            third=first+second;
            System.out.println(third+" ");
            first=second;
            second=third;
        }
    }
}