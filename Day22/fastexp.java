class fastexp
{
    public static int fastexp(int a,int n)
    {
        int ans=1;
        while(n>0)
        {
            if((n&a)!=0)
            {
                ans=ans*a;
                n=n>>1;
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
System.out.println(pow2(5,3));
    }
}