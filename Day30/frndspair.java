class frndspair
{
    public static void main(String args[])
    {
        
        System.out.println(pairing(3));
    }
    public static int pairing(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        int fnm1=pairing(n-1);
        int fnm2=pairing(n-2);
        int pairways=(n-1)*fnm2;
        int tot=fnm1+pairways;
       return tot;
    }
}