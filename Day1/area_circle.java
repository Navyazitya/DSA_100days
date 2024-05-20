import java.util.*;
public class area_circle
{
    public static void main(String args[])
    {
        double radius;
        double pi=3.14;
        double area;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        radius= Sc.nextDouble();
        area= pi*radius*radius;
        System.out.println(area);
    }
}