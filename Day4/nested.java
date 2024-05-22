import java.util.Scanner;
public class nested{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int n=Sc.nextInt();
        if(n>=18)
        {
            System.out.println("you can vote! ");
        }
        if(n>13 && n<18)
        {
            System.out.println("teenager");
        }
        else
        {
            System.out.println("Cant vote");
        }
    }
}