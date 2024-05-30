public class sumdigits
{
    public static int sumdigits(int num)
    {
        int sum=0;
        while(num>0)
        {
        int last=num%10;
        sum=sum+last;
        num=num/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
      int ans = sumdigits(12345);
      System.out.println(ans);
    }
}