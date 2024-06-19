public class maxarea
{
    public static int maxarea(int height[])
    {
        int max=0;
        for(int i=0;i<height.length;i++)
        {
            for(int j=i+1;j<height.length;j++)
            {
                int breadth=Math.abs(j-i);
                int length=Math.min(height[i],height[j]);
                int area=breadth*length;
                max=Math.max(area,max);
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        int height[]={1,8,6,2,5,4,8,3,7};
        int ans=maxarea(height);
        System.out.println(ans);
    }
}