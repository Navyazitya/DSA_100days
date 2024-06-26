class optimizedpow
{
    public static void main(String args[])
    {
        System.out.println(opown(2,10));
    }
    public static int opown(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int halfpow=opown(x,n/2);
        int halfpowf=halfpow*halfpow;

        if(n%2!=0)
        {
            halfpowf=x*halfpowf;
        }
        return halfpowf;
}
}