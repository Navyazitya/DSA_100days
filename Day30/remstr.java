class remstr
{
    public static void main(String args[])
    {
        String str="appnnacollege";
        remdup(str,0,new StringBuilder(""),new boolean[26]);
    }
    public static void remdup(String str, int idx, StringBuilder newstr, boolean map[])
    {
        if(idx==str.length())
        {
            System.out.println(newstr);
            return ;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true)
        {
            remdup(str,idx+1,newstr,map);
        }
        else
        {
            map[currchar-'a']=true;
            remdup(str,idx+1,newstr.append(currchar),map);
        }
    }
}