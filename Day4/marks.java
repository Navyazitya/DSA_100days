import java.util.Scanner;
public class marks{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter you marks: ");
        int n=Sc.nextInt();
        String result=n>=33?"pass":"fail";
            System.out.println(result);
    }
}