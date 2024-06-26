class last
{
    public static void main(String args[])
    {
        int n=5;
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(lasto(arr,5,0));
    }
    public static int lasto(int arr[],int key,int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
        int lf= lasto(arr,key,i+1);
        if(lf==-1&&arr[i]==key)
        {
            return i;
        }
       return lf;
    }
}