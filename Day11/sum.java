import java.util.*;
public class sum
{
    public static int calsum(int n1,int n2)   //formal parameters
    {
int sum=n1+n2;
return sum;
    }
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int sum = calsum(a,b); //arguments or actual parameters
System.out.println(sum);
    }
}