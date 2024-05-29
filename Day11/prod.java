import java.util.*;
public class prod
{
    public static int calprod(int n1,int n2)   //formal parameters
    {
int prod=n1*n2;
return prod;
    }
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int prod = calprod(a,b); //arguments or actual parameters
System.out.println(prod);
prod = calprod(5,4);
System.out.println(prod);
    }
}