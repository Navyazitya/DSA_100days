import java.util.*;
public class weekdeo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day: ");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1,2,3,4,5:
                {
                  System.out.println("weekday");
                break;
                }
            case 6,7:
                {
                  System.out.println("weekend");
                break;
                }
                default:
                    {
                        System.out.println("invalid input");
                   break;
                     }
            }
    }
}