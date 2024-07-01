class tiling
{
    public static void main(String args[])
    {
        
        System.out.println(tile(2));
    }
    public static int tile(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        int vt=tile(n-1);
        int ht=tile(n-2);
        int tot=vt+ht;
       return tot;
    }
}