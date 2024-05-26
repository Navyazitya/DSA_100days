import java.util.*;
import java.io.*;
public class palin_string
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String word=sc.next();
        String rev="";
        for(int i=word.length()-1;i>=0;i--)
        {
            rev=rev+word.charAt(i);
        }
        if(word.equals(rev))
        {
            System.out.println("palin");
        }
        else
        {
            System.out.println("not palin");
        }
    }
}