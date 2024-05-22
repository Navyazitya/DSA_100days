import java.util.Scanner;
public class else_if{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int n=Sc.nextInt();
        if(n>=18)
        {
            System.out.println("you can vote! ");
        }
        else if(n>13 && n<18)
        {
            System.out.println("teenager");
        }
        else
        {
            System.out.println("Cant vote");
        }
    }
}