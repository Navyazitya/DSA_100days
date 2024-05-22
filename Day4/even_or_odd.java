import java.util.Scanner;
public class even_or_odd{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        int n=Sc.nextInt();
        if(n%2==0)
        {
            System.out.println("It is an even number ");
        }
        else
        {
            System.out.println("It is an odd number ");
        }
    }
}