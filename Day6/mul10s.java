import java.util.*;
public class mul10s
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers");
        do{
            int n=sc.nextInt();
            if(n%10==0)
            {
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}