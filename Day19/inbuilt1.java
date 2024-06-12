import java.util.*;
public class inbuilt1
{
    public static void printarr(Integer arr[])
    {
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    }
public static void main(String args[])
    {
        Integer arr[]={5,4,1,3,2};
        Arrays.sort(arr, Collections.reverseOrder());
        printarr(arr);   
         }
}