import java.util.*;
class fizzbuzz
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        if(n%15==0)
        {
            System.out.println("FizzBuzz number");
        }
        else if(n%3==0)
        {
            System.out.println("Fizz number");
        }
        else if(n%5==0)
        {
            System.out.println("Buzz number");
        }
        else
        {
            System.out.println(n);
        }
    }
}