import java.util.*;
public class swapcv
{
    public static void swap(int a,int b)   //formal parameters
    {
int temp=a;
a=b;
b=temp;
    }
    public static void main(String args[])
    {
int a=5;
int b=10;
swap(a,b);
System.out.println(a);
System.out.println(b); //call by value
    }
}