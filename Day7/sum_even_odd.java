import java.util.*;
public class sum_even_odd
{
    public static void main(String args[])
    {
        int Evensum=0,Oddsum=0,choice;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter your number: ");
            int n=sc.nextInt();
            if(n%2==0)
            {
                Evensum=Evensum+n;
            }
            else
            {
                Oddsum=Oddsum+n;
            }
        System.out.println("Enter 1 to continue and 0 to stop: ");
        choice=sc.nextInt();
        }
        while(choice==1);
        System.out.println("even: "+Evensum);
        System.out.println("odd: "+Oddsum);
    }
}