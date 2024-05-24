import java.util.*;
import java.lang.Math;
class check_prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        boolean isprime=true;
        if(n==2)
        {
            System.out.println("prime");
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                isprime=false;
            }
        }
        if(isprime==true)
        {
           System.out.println("prime"); 
        }
            else
            {
                System.out.println("not prime");
            }
        }
        }
}