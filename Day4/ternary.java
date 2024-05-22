import java.util.*;
public class ternary
{
    public static void main(String args[])
    {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be checked: ");
        number=sc.nextInt();
       String result= number%2==0?"even":"odd";
    System.out.println(result);
    }
}