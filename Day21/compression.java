public class compression
{
    public static String compression(String str)
    {
        String newstr="";
      for(int i=0;i<str.length();i++)
      {
        Integer count=1;
        while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
        {
            count++;
            i++;
        }
        newstr=newstr+str.charAt(i);
        if(count>1)
        {
            newstr=newstr+count.toString();
        }
      }
      return newstr;
    }
    public static void main(String args[])
    {
     String str="aaabbcccdd";
     System.out.println(compression(str));
    }
}