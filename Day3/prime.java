import java.util.*;
public class prime
{
    public static void main(String args[])
    {
        int n,c=0,i;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        n=Sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
            if(c==2)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not Prime");
            }
        }
    }