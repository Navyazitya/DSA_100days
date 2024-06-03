import java.util.*;
public class large
{
    public static int large(int num[])
    {
        int large=Integer.MIN_VALUE;  //-infinity
        for(int i=0;i<num.length;i++)
        {
            if(large<num[i])
            {
                large=num[i];
            }
        }
        return large;
    }
    public static void main(String args[])
    {
int num[]={1,2,3,4,5,6,7};
System.out.println("largest value: "+large(num));
    }
}