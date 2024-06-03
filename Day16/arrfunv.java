import java.util.*;
public class arrfunv
{
    public static void update(int marks[],int nc)
    {
        for(int i=0;i<marks.length;i++)
        {
           marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[])
    {
        int marks[]={97,98,99};
        int nc=5;
        update(marks,nc);
        System.out.println(nc);
        
        //printing
        for(int i=0;i<marks.length;i++)
        {
             System.out.println("math: " +marks[i]);
        
        }
     } 
}