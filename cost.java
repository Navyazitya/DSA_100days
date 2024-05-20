import java.util.*;
public class cost
{
    public static void main(String args[])
    {
        float pencil,pen,eraser,sum,gst,total;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter cost of pencil: ");
        pencil= Sc.nextFloat();
        System.out.println("Enter cost of pen: ");
        pen= Sc.nextFloat();
        System.out.println("Enter cost of eraser: ");
        eraser= Sc.nextFloat();
        sum=pencil+pen+eraser;
        gst=(18*sum)/100;
        total=sum+gst;
        System.out.println("Total cost is: "+total);
    }
}