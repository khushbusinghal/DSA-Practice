import java.util.ArrayList;

public class Sorting {
    public void selectionSort(int arr[])
    {
        
        for(int i=0; i<arr.length; i++)
        {
            int smaller=arr[i];
            for(int j=i; j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    smaller = arr[j];
                    arr[j]= arr[i];
                    arr[i] = smaller;
                   
                }
            }
        }
        for (int n: arr)
        {
            System.out.println(n);
        }
    }
    public void bubbleSort(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
         
            for (int j=0; j<arr.length-i-1; j++)
            {  
               if( arr[j]>arr[j+1])
               {
                
                    int temp = arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j]= temp;
               }

            }
        }
        for (int n: arr)
        {
            System.out.println(n);
        }
    }
    public void insertionSort(int[] arr, int n)
    {
        for(int i=0; i<n; i++)
        {
           // System.out.println("i-->"+i);
            for(int j=i; j>=0 && j!=n-1;j--)
            {
               // System.out.println("-->"+j+"-->"+arr[j]+"-->"+arr[j+1]);
                if(arr[j]>arr[j+1])
                {
                    System.out.println("inside if");
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        for (int k: arr)
        {
            System.out.println(k);
        }
    }
    public void mergeSort(int[] arr, int low, int high)
    {
       int mid = (low+high)/2;
       System.err.println("value of mid: "+ mid);
       if(low>=high)
       {
        return;
       }
       System.out.printf("merge sort 1 started with low %d, mid %d",low, mid);
       System.out.println("");
        mergeSort(arr,low, mid);
        System.out.printf("merge sort 1 completed with low %d, mid %d",low, mid);
        System.out.println("");
        System.out.printf("merge sort 2 started with  mid %d, high %d", mid,high);
        System.out.println("");
        mergeSort(arr, mid+1, high);
        System.out.printf("merge sort 2 completed with  mid %d, high %d", mid,high);
        System.out.println("");
        merge(arr, low, mid, high);
        System.out.println("merge completed");
      
    }
    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        for (int k: arr)
        {
            System.out.println(k);
        }
    }
    public void recurciveBubbleSort(int[] arr,int n)
    {
        System.out.printf("recursive func called with n = %d",n);
        System.out.println("");
        if(n==1)
        {
           
            
            return;
        }
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1] = temp;
            }
        }
        recurciveBubbleSort(arr, n-1);
    }
    public void recurciveInsertionSort(int[] arr,int n, int selectedIndex)
    {
        System.out.printf("recursive func called with n = %d and selectedIndex = %d",n,selectedIndex);
        System.out.println("");
        if(selectedIndex==n){
            for (int k: arr)
            {
                System.out.println(k);
            }
            return;
        }
         for(int i=selectedIndex; i>0; i--)
         {
            if(arr[i]<arr[i-1])
            {
            System.out.println("swap");
               int temp = arr[i];
               arr[i] = arr[i-1];
               arr[i-1] = temp;
            }
         }
         recurciveInsertionSort(arr,n,selectedIndex+1);
    }
    public void quickSort(int[] arr, int low, int high)
    {
        System.out.printf("quick sort func called with low = %d and high = %d",low,high);
        System.out.println("");
       if(low<high){
       
        int pivot = arr[low];
        int partitionIndex= partition(arr,low,high,pivot);
        quickSort(arr, low, partitionIndex);
        quickSort(arr, partitionIndex+1, high);
       }
       for (int k: arr)
            {
                System.out.println(k);
            }

    }
    public int partition(int[] arr, int low, int high, int pivot)
    {
        System.out.println("partition is called");
        int partitionIndex = low;
        for(int i=low; i<=high; i++)
        {
            
            if(arr[i]<pivot)
            {
                int temp = arr[i];
                arr[i] = arr[partitionIndex];
                arr[partitionIndex] = temp;
                partitionIndex++;
            }
        }

        return partitionIndex;
    }
    public static void main(String[] args) {
        Sorting sr = new Sorting();
        int[] arr = {2,0,2,1,1,0};
       // sr.selectionSort(arr);
        //sr.bubbleSort(arr);
       //sr.insertionSort(arr, 4);
       //sr.mergeSort(arr, 0, 3);
       //sr.recurciveInsertionSort(arr,6,0);
       sr.insertionSort(arr, 6);
      
    }
    
}

