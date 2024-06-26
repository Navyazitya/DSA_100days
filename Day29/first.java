class first
{
    public static void main(String args[])
    {
        int n=5;
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(firsto(arr,5,0));
    }
    public static int firsto(int arr[],int key,int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
       return firsto(arr,key,i+1);
    }
}