import java.util.*;
class menu
{
    public static void main(String args[])
    {
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter choice: ");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1: System.out.println("samosa");
            break;
            case 2: System.out.println("biryani");
            break;
            case 3: System.out.println("mandi");
            break;
            default:
                System.out.println("Enter correct number ");
        }

    }
}