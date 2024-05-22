import java.util.*;
public class largest
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        if(a>b){
            System.out.println(" a is greatest ");
        }
        else if(b>a)
        {
            System.out.println(" b is greatest ");
        }
        else{
            System.out.println(" a and b are equal ");
        }
    }
}