import java.util.*;
class leap
{
    public static void main(String args[])
    {
        int year;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a year: ");
        year=Sc.nextInt();
        boolean x=(year%4)==0;
        boolean y=(year%100)!=0;
        boolean z=(((year%100)==0)&&((year%400)==0));
        if(x&&(y||z))
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("not a leap year");
        }
    }
}