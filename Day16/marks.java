import java.util.*;
public class marks
{
    public static void main(String args[])
    {
        int marks[]=new int [100];
        Scanner Sc=new Scanner(System.in);
        marks[0]=Sc.nextInt();//m
        marks[1]=Sc.nextInt();//p
        marks[2]=Sc.nextInt();//c

        System.out.println("math: " +marks[0]);
        System.out.println("phy: " +marks[1]);
        System.out.println("chem: " +marks[2]);
    
    int percent=(marks[0]+marks[1]+marks[2])/3;
    System.out.println("you got: "+percent+"%");
    } 
}