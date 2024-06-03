import java.util.*;
public class small
{
    public static int small(int num[])
    {
        int small=Integer.MAX_VALUE;  //-infinity
        for(int i=0;i<num.length;i++)
        {
            if(small>num[i])
            {
                small=num[i];
            }
        }
        return small;
    }
    public static void main(String args[])
    {
int num[]={1,2,3,4,5,6,7};
System.out.println("smallest value: "+small(num));
    }
}