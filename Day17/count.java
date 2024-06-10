import java.util.*;
public class count
{
    public static void main(String args[])
    {
        int count=0;
       Scanner sc =new Scanner(System.in);
       int marks[]=new int[10];
       for(int i=0;i<10;i++)
       {
        marks[i]=sc.nextInt();
       }
       for(int i=0;i<10;i++){
       if(marks[i]>90)
       {
        count++;
       }}
       System.out.println("students greater than 90: "+count);
    }
}