import java.util.*;
public class prime_range_user
{
    public static void main(String args[])
    {
        int i,j,a,b;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the numbers limits: ");
        a=Sc.nextInt();
        b=Sc.nextInt();
        for(i=a;i<=b;i++)
        {
            int c=0;
            for(j=1;j<=i;j++)
            {
            if(i%j==0)
            {
                c++;
            }
            }
        if(c==2)
        {
            System.out.println("Prime numbers are: "+i+" ");
        }
}
}
}