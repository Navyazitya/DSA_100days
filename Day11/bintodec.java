import java.lang.Math;
public class bintodec
{
    public static void bintodec(int bn)
    {
int pow=0;
int dec=0;
while(bn>0)
{
    int last=bn%10;
    dec=dec+(last*(int)Math.pow(2,pow));

    pow++;
    bn=bn/10;
}
System.out.println(dec);
    }
    public static void main(String args[])
    {
bintodec(101);
    }
}