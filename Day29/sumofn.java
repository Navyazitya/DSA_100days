class sumofn
{
    public static void main(String args[])
    {
        int n=5;
        System.out.println(sum(n));
    }
    public static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
       int s=n+sum(n-1);
       return s;
    }
}