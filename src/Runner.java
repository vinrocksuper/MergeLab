public class Runner {
    public static void main(String[] args)
    {
        int[] test = {4,3,2,1};
        mergeSort(test);


    }
    public static void mergeSort(int[] arr)
    {
        int n= arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr,0,n-1,temp);
    }
    public static void mergeSortHelper(int[] arr,int left,int right, int[] temp)
    {
        if(left<right)
        {
            int mid = (left+right)/2;
            mergeSortHelper(arr,left,mid,temp);
            mergeSortHelper(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }
    public static void merge(int[] arr,int left,int mid,int right,int[] temp)
    {
        String s = "";
        for(int i=left;i<=right;i++)
        {
            if(arr[i]<arr[right])
            {
                temp[i] = arr[left];



            }
            else
            {
                temp[i] = arr[right];



            }
        }
       
    }
}
