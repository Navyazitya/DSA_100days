import java.util.*;
class sign
{
    public static void main(String args[])
    {
        int n;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=Sc.nextInt();
        if(n>0)
        {
            System.out.println("positive");
        }
        else if(n<0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("zero");
        }
    }
}