class bottomleftri
{
    public static void main(String args[])
    {
        int n=5;
        int tot=2*n-1;
        int spaces=n-1;
        int stars=1;
        int current=1;
        while(current<=tot)
        {
            //spaces
            for(int i=1;i<=spaces;i++)
            {
                System.out.print("  ");
            }
            //stars
            int num=1;
            for(int i=1;i<=stars;i++)
            {
                System.out.print(num+" ");
                if(i<=stars/2)
                {
                num++;
                }
                else{
                num--;
                }
            }
            //prep for next line
            System.out.println();
            if(current<n)
            {
                spaces--;
                stars=stars+2;
            }
            else{
            spaces++;
            stars=stars-2;
        }
        current++;
    }
}
}