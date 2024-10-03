import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class ArrayProblems {
    public int largestElement(int[] arr, int n)
    {
        Arrays.sort(arr);
        return arr[n-1];
    }
    public int secLargestElement(int[] arr, int n)
    {
        Arrays.sort(arr);
        int largest = arr[n-1];
        int i=0;
        while(true)
        {
            
            if(arr[n-2-i]<largest)
            {
               return arr[n-2-i];
            }
            i++;
        }
        
    }
    public void isArraySorted(int[] arr, int n)
    {
        boolean sorted = true;
        for(int i=1; i< n-1;i++)
        {
            if(arr[i-1]>arr[i])
            {
                sorted = false;
            }
        }
        if (sorted)
        System.out.println("Array is sorted");
        else
        System.out.println("Array is not sorted");
    }
    public void removeDuplicate(int[] arr, int n)
    {
        int firstPonter = 0;
        for(int secPointer = 1; secPointer<n; secPointer++)
        {
            if(arr[firstPonter]==arr[secPointer])
            {
                //do nothing
            }
            else
            {
                firstPonter++;
                arr[firstPonter] = arr[secPointer];
            }
        }
        for (int k: arr)
        {
                System.out.println(k);
        } 
            
        
    }
    public void rotateArray(int[]arr, int high, int d)
    {
        reverse(arr, 0,d);
        reverse(arr,d+1,high);
        reverse (arr, 0,high);
        for (int k: arr)
        {
                System.out.println(k);
        }

    }
    private void reverse(int[] arr, int i, int d) 
    {
        while (i<=d)
        {
            int temp = arr[i];
            arr[i] = arr[d];
            arr[d] = temp;
            i++;
            d--;
        }
    }
    public void removeZero(int[] arr, int n)
    {
        int j=0;
        for(int i=0; i<=n;i++)
        {
            if (arr[i]==0)
            {
                //do nothing
            }
            else
            {
               int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            
        }
        for (int k: arr)
        {
                System.out.println(k);
        }
    }
    static int searchInSorted(int arr[], int N, int K) 
    {
        int found = -1;
        for(int i=0; i<N;i++)
        {
            if (arr[i]==K)
            found = i;
           
        }
        return found;
    }
    public void unionTwoArrays(int[] arr1, int[] arr2)
    {
       ArrayList arrayList = new ArrayList<Integer>();
       int n1 = arr1.length;
       int n2= arr2.length;
       int i=0;
       int j=0;
       while(i<n1 && j<n2)
       {
          if(arr1[i]<arr2[j])
          {
            if(arrayList.isEmpty() || ! arrayList.contains(arr1[i]))
            {
                arrayList.add(arr1[i]);
               
            }
            i++;
          }
          else
          {
            if(arrayList.isEmpty() || ! arrayList.contains(arr2[j]))
            {
                arrayList.add(arr2[j]);
                
            }
            j++;
          }
        }
          if(j<n2)
          {
            arrayList.add(arr2[j]);
            j++;
          }
          else if (i<n1)
          {
            arrayList.add(arr1[i]);
            i++;
          }
       
       arrayList.forEach(n->System.out.println(n));
    }
    public void countOne(int[] arr, int n)
    {
        int maxCount = 0;
        int count = 0;
        for (int i =0; i<n;i++)
        {
            if (arr[i] == 1)
            {
                count++;
            }
            else
            {
                
                maxCount = Math.max(maxCount,count);
                
                count =0;
            }
        }
        System.out.println("maxCount::"+maxCount);
    }
    public void aloneMember1(int[] arr, int n)
    {
        HashMap map = new HashMap<Integer,Integer>();
        int count = 0;
        for(int i=0; i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            map.put(arr[i],count);
            count = 0;
        }
        Iterator<Map.Entry> itr = map.entrySet().iterator(); 
        while (itr.hasNext())
        {
            Map.Entry<Integer, Integer> entry = itr.next(); 
           if (Integer.valueOf(entry.getValue())==1)
           {
                System.out.println("Single Number is :"+entry.getKey());
           }
        }

    }
    public void aloneMember2(int[] arr,int n)
    { 
        int xor =0;
        for(int i=0; i<n; i++)
        {
            xor= xor^arr[i];
        }
        
        if (xor==0)
        System.out.println("None of the number is single");
        else
        System.out.println("Single Number is :"+xor);
    }
    public void largestSubarray(int[]arr,int sum)
    {
        int noofitems = 0;
        for(int i=0; i<arr.length; i++)
        { 
            int tempsum =0;
            int j=i;
            while(true)
            {
                tempsum = tempsum + arr[j];
                if(tempsum >=sum)
                    break;
                 else
                    j++;
            }
            if(tempsum==sum)
            {
                System.out.printf("we got a subarray between indexes %d and %d",i,j);
                System.out.println("");
                noofitems = Math.max(noofitems,(j-i));
                
            }

        }
        System.out.println("noofitems: "+ (noofitems+1));
    }
    public void largestSum(int[]arr)
    {
        int maxSum = 0;
        for(int i=0; i<arr.length; i++)
        { 
            int tempsum =0;
            int j=i;
            while(j<arr.length)
            {
                tempsum = tempsum + arr[j];
                j++;
                maxSum = Math.max(tempsum,maxSum);               
            }
            

        }
        System.out.println("maxSum: "+ maxSum);
    }
    public void kedaceTheorm(int [] arr, int n)
    {
        //{-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = Integer.MIN_VALUE;;
        int curSum = 0;
        int start =0;
        int ansEnd = -1;
        int ansStart=-1;
        for(int i=0; i<n;i++)
        {
            
            curSum = curSum+ arr[i];                     
            if(curSum>maxSum)
            {
                maxSum = curSum;
                ansEnd = i;
                //ansStart = start;
            }
            if (curSum <0)
            {
                curSum=0;
              
            } 
            if(curSum==0)ansStart =i;
        }
        System.out.println(maxSum + " is the largest sum of the subarray. and indexes are start and end "+ansStart+","+ansEnd);
    }
    public void stockBuySell(int arr[], int n)
    {
        int min = 0;
        int maxProfit=0;
        for(int i=0; i<n;i++)
        {
            if(i==0)
            {
                min = arr[i];

            }
            else min = Math.min(min,arr[i]);
            int profit = arr[i]-min;
            maxProfit = Math.max(profit,maxProfit);
           
        }
        System.out.println("MaxProfit:"+maxProfit);
    }
    public void largestSubarray2(int[] arr, int n, int sum)
    {
        HashMap map = new HashMap<Integer,Integer>();
        int largestSubarrayLength = 0;
        int presum = 0;
        int start =0;
        int end =0;
        for(int i=0; i<n; i++)
        {  
            presum = presum+ arr[i];
            map.put(presum, i);
            System.out.println(map);
            if(presum-sum==0)
            {
                start = 0;
                end = i;
                largestSubarrayLength = i+1;
                System.out.printf("starting and ending indexes are %d and %d ", start, end);
                System.out.println("");

            }
            else if(map.containsKey(presum-sum))
            {
                start =  Integer.valueOf(map.get(presum-sum).toString())+1;
                end = i;
                System.out.printf("starting and ending indexes are %d and %d ", start, end);
                System.out.println("");
                largestSubarrayLength = Math.max(end-start+1,largestSubarrayLength);
            }

        }
        System.out.println(largestSubarrayLength);
    }
    public void arrangeBySign(int arr[], int n)
    {
        int[] ans = new int[n];
        int negativeIndex =1;
        int positiveIndex =0;
        int negNum =0;
        int posNum =0;
        for(int i=0; i<n;i++)
        {
            if(arr[i]>0)
            {
                //positive numbers
                ans[positiveIndex] = arr[i];
                positiveIndex = positiveIndex+2;
                posNum++;

            }
            else if(arr[i]<0)
            {
                //negative numbers
                ans[negativeIndex]= arr[i];
                negativeIndex = negativeIndex+2;
                negNum++;
            }
                
        }
        for(int k :ans)

        {
            System.out.println(k);
        }
    }
    public static void main(String[] args) {
        ArrayProblems ar = new ArrayProblems();
        int[] arr =  {1,2,3,-1,-2,-3,4,5};
        int[] sarr = {11,13,14};
        int[] zarr = { 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int[] arrOne = {1,0,0,0,1,1,1,1,1,0,0,1,1};
      // System.out.println( ar.secLargestElement(arr, 7));
      //ar.isArraySorted(sarr, 7);
      //ar.removeDuplicate(sarr, 9);
      //ar.rotateArray(arr, 5, 3);
      //ar.removeZero(zarr,7);
      //System.out.println(ar.searchInSorted(zarr,8,4));
      //ar.unionTwoArrays(arr, sarr);
      //ar.countOne(arrOne, 12);
      //ar.aloneMember2(arr, 8);
      int[] array = {6,7,2,3,5,8};
      ar.stockBuySell(array, 6);
      //ar.largestSum(arr);
      //ar.kedaceTheorm(arr,9);
      //ar.arrangeBySign(arr, 8);

      
    }
    
}
