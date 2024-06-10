public class sumofsub
{
    public static void subarray(int num[])
    {
        int ts=0; 
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++)
        {
            int start=i;
            for(int j=i;j<num.length;j++)
            {
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++)
                {
                System.out.print(num[k]+" ");
                sum=sum+num[k];
                }
            ts++;
            System.out.print("Sum: "+sum);
            if(sum>max){
                max=sum;
            }
            if(sum<min)
            {
                min=sum;
            }
            System.out.println();
        }
        System.out.println();
    }
    
    System.out.println("total subarrays: "+ts);
    System.out.println("max: "+max);
    System.out.println("min: "+min);
    }
    public static void main(String args[]){
        int num[]={2,3,4,5,6};
        subarray(num);
    }
}