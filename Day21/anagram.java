import java.util.*;
public class anagram
{
    public static void main(String args[])
    {
     String str1="care";
     String str2="race";
     //lower
     str1 = str1.toLowerCase();
     str2 = str2.toLowerCase();
     //comparing lengths
     if(str1.length()==str2.length())
     {
        //char array
       char str1c[]=str1.toCharArray();
       char str2c[]=str2.toCharArray();
       //sorting
       Arrays.sort(str1c);
       Arrays.sort(str2c);
       //comparing
       boolean res= Arrays.equals(str1c,str2c);
       if(res)
       {
        System.out.println("anagram");
       }
       else{
        System.out.println("not anagram");
       }
     }
     else
     {
      System.out.println("not, lenghts also not equal");  
     }
    }
}