import java.util.*;
class menu
{
    public static void main(String args[])
    {
        int a,b;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two operands: ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter choice: ");
        ch=sc.next().charAt(0);
        switch(ch)
        {
            case '+': System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '/': System.out.println(a/b);
            break;
            case '%': System.out.println(a%b);
            break;
            default:
                System.out.println("Enter correct operation ");
        }
    }
}