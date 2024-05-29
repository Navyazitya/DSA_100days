import java.util.*;
public class swap
{
    public static void swap(int a,int b)   //formal parameters
    {
int temp=a;
a=b;
b=temp;
System.out.println(a);
System.out.println(b);
    }
    public static void main(String args[])
    {
int a=5;
int b=10;
swap(a,b);
    }
}