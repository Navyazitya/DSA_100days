import java.util.Scanner;
public class adult{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int n=Sc.nextInt();
        if(n>=18)
        {
            System.out.println("you can vote! ");
        }
        else
        {
            System.out.println("Cant vote");
        }
    }
}