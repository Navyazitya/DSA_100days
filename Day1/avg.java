import java.util.*;
public class avg
{
    public static void main(String args[])
    {
        int a,b,c,sum,avg;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        a=Sc.nextInt();
        b=Sc.nextInt();
        c=Sc.nextInt();
        sum=a+b+c;
        avg=sum/3;
        System.out.println("Average:"+avg);
    }
}