import java.util.*;
public class timezoneconv
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter time: ");
        int day=sc.nextInt();
        int hour=sc.nextInt();
        int min=sc.nextInt();

        hour=hour+5;
        min=min+30;

        if(min>=60)
        {
            hour++;
            min=min-60;
        }
        if(hour>=24)
        {
            day++;
            hour=hour-24;
        }
        System.out.println("day:"+day+", hour:"+hour+", min:"+min);
    }
}