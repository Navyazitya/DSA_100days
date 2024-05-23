import java.util.*;
public class primeoptimized
{
    public static void main(String args[])
    {
        int n,i;
        boolean isPrime = true;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        n=Sc.nextInt();
        for(i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                isPrime=false;
                break;
            }
        }
            if(isPrime == true)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not Prime");
            }
        }
    }