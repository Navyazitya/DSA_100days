class incorder
{
    public static void main(String args[])
    {
        int n=10;
        inc(n);
    }
    public static void inc(int n)
    {
        
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        inc(n-1);
        System.out.println(n+" ");
    }
}