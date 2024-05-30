public class palin
{
    public static int reverse(int n)
    {
        int rev=0;
        while(n>0)
        {
        int last=n%10;
        rev=(rev*10)+last;
        n=n/10;
        }
        return rev;
    }
    public static boolean isPalin(int a)
    {
        int reva=reverse(a);
        if(reva==a)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[])
    {
boolean ans=isPalin(121);
System.out.println(ans);
    }
}