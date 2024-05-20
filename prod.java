import java.util.*;
public class prod
{
    public static void main(String args[])
    {
        int a,b,prod;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter numbers to be multiplied: ");
        a= Sc.nextInt();
        b=Sc.nextInt();
        prod=a*b;
        System.out.println(prod);
    }
}