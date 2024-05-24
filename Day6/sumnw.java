import java.util.*;
public class sumnw
{
    public static void main(String args[])
    {
        int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter ending number: ");
int n=sc.nextInt();
int i=0;
while(i<=n)
{
    sum=sum+i;
    i++;
}
System.out.print("The sum is: "+sum);
}
}