import java.util.*;
public class typecas
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter numbers to be multiplied: ");
        float a= 12.55f;
        int b = (int)a; //lossy conversion
        System.out.println(b);

        char ch='a';
        int num=ch;
        System.out.println(num);
    }
}