public class Runner {
    public static void main(String[] args)
    {
        int[] test = new int[100000];
        for(int i=0;i<100000;i++)
        {
            test[i] = (int)(Math.random()*1001);
        }
          long time = System.nanoTime();
        mergeSort(test);
        System.out.println((double)(System.nanoTime() - time)/(100000000));

        for(int i=0;i<test.length;i++) {
            System.out.print(test[i] + " ");
        }
        String[] test2 = new String[10];
        for(int i=0;i<test2.length;i++)
        {
            test2 = randomStringArr(test2.length,10);
        }
        mergeSort(test2);
        for(int i=0;i<test2.length;i++) {
            System.out.print(test2[i] + " ");
        }
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
        int i=left;
        int j=mid+1;
        int k=left;
        while(i<=mid && j<=right){
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;

        }
        while(i<=mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=right)
        {
            temp[k]  =arr[j] ;
            j++;
            k++;
        }
        for(int z=left;z<=right;z++)
        {
            arr[z] = temp[z];
        }

    }
    public static void mergeSort(String[] arr)
    {
        int n= arr.length;
        String[] temp = new String[n];
        mergeSortHelper(arr,0,n-1,temp);
    }
    public static void mergeSortHelper(String[] arr,int left,int right, String[] temp)
    {
        if(left<right)
        {
            int mid = (left+right)/2;
            mergeSortHelper(arr,left,mid,temp);
            mergeSortHelper(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }
    public static void merge(String[] arr,int left,int mid,int right,String[] temp)
    {
        int i=left;
        int j=mid+1;
        int k=left;
        while(i<=mid && j<=right){
            if(arr[i].compareTo(arr[j])<0)
            {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;

        }
        while(i<=mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=right)
        {
            temp[k]  =arr[j] ;
            j++;
            k++;
        }
        for(int z=left;z<=right;z++)
        {
            arr[z] = temp[z];
        }

    }
    public static String[] randomStringArr(int num, int length){
        String[] arr = new String[num];
        while(num>0)
        {
            int i=0;
            String s = "";
            while(i<length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s+c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;

    }

}
