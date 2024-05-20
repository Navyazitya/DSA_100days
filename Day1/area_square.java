import java.util.*;
public class area_square
{
    public static void main(String args[])
    {
        double side;
        double area;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter side of the square: ");
        side= Sc.nextDouble();
        area= side*side;
        System.out.println(area);
    }
}