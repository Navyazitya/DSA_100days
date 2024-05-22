import java.util.*;
public class large3
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        int c=Sc.nextInt();
        if(a>=b && a>=c){
            System.out.println(" a is greatest ");
        }
        else if(b>=a && b>=c)
        {
            System.out.println(" b is greatest ");
        }
        else{
            System.out.println(" c is greatest ");
        }
    }
}