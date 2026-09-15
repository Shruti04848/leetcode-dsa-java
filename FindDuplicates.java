public class FindDuplicates
{
    public static void findDuplicates(int arr[])
    {
        for (int i=0;i<arr.length-1;i++)
        {
            if(arr[i] ==arr[i+1])
            {
                System.out.println(arr[i]);
            
            }
        }
    }
    public static void main(String args[])
    {
        int arr[]={1,2,2,3,4};

        System.out.println("Dupicate elements:");
        findDuplicates(arr);
    }
}   