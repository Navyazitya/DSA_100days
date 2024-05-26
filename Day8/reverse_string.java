import java.util.*;
import java.io.*;
public class reverse_string
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String word=sc.nextLine();
        String r="";
        for(int i=word.length()-1;i>=0;i--)
        {
            r=r+word.charAt(i);
        }
    System.out.print(r);
    }
}