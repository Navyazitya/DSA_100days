class hollow_rhombus
{
    public static void main(String args[])
    {
        int n=5;
        int tot=2*n-1;
        int outspaces=n-1;
        int inspaces=0;
        int current=1;
        while(current<=tot)
        {
            //outspaces
            for(int i=1;i<=outspaces;i++)
            {
                System.out.print(" ");
            }
            // stars and inspaces
            if (current == 1 || current == tot) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for (int i = 1; i <= inspaces; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            //prep for next line
            System.out.println();
            if(current<n)
            {
            outspaces--;
            inspaces=inspaces+2;
            }
            else
            {
                outspaces++;
                inspaces=inspaces-2;
            }
            current++;
        }
    }
}