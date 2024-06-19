public class maxareaopt
{
    public static int maxarea(int height[])
    {
        int max=0;
        int left=0;
        int right=height.length-1;
       while(left<=right)
       {
        int area=0;
                int length=Math.min(height[left],height[right]);
                int breadth=Math.abs(left-right);
                area=breadth*length;
                max=Math.max(area,max);
                if(height[left]<=height[right])
                {
                    left++;
                }
                else
                {
                     right--;
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