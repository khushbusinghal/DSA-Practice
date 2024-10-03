import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ArrayAdvanceProblem {
    public void twoSum(int[]arr, int n, int target)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for (int i=0; i<n;i++)
        {
           
            if(map.containsKey(target-arr[i]))
            {
                int first_index =map.get(target-arr[i]);
                int second_index = i;
                System.out.printf("first and second indexes are %d and %d .",first_index,second_index);

            }
            map.put(arr[i],i);
        }
       
    }
    public void sort(int[] arr, int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=i; j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int k: arr)
            {
                System.out.println(k);
            }

    }
    public void majorityElement(int[] a, int n)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<n;i++)
        {
            if(!map.containsKey(a[i]))
            {
                map.put(a[i], 1);
            }
            else
              map.put(a[i],map.get(a[i])+1);
        }
        int max = Collections.max(map.values());
        if (max>n/2)
        {
            for( Entry <Integer,Integer>  entry: map.entrySet())
            {
                if(entry.getValue()==max)
                {
                    System.out.printf("Majority element is %d",entry.getKey());
                }
            }
        }
    }
    public void mooreMajorityElement(int[] a, int n)
    {
        int count = 0;
        int pointerIndex = 0;
        for(int i=0; i<n-1; i++)
        {
            if(a[i]==a[pointerIndex])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count ==0)
            {
                count =1;
            }
            pointerIndex = i;
            
        }
        int maxOccItem = a[pointerIndex];
        int c =0;
        for(int k: a)
        {
            if(k==maxOccItem)
            {
                c++;
            }

        }
        if (c>n/2)
        {
            System.out.println("Majority item is :"+maxOccItem);
        }
    }
    public void leaderElement(int a[], int n)
    {
        System.out.println("find leader");
        for(int i=0; i<n;i++)
        {
            boolean isLeader = true;
           for(int j=i+1; j<n;j++)
           {
                if(a[i]<a[j])
                {
                    isLeader = false;
                    break;
                }
           }
           if(isLeader)
            System.out.println(a[i] + " is a leader.");
        }
        
    }
    public void leaderElement2(int[] ar,int n)
    {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i=n-1; i>0; i--)
        {
            if(ar[i]> max)
            {
                array.add(ar[i]);
                max= Math.max(ar[i],max);
            }
            
        }
        for(int k :array)
        {
            System.out.println(k);
        }
    }
    public int largestConsecutiveSeq(int[]arr, int n)
    {
        Arrays.sort(arr);
        for(int k :arr)
        {
            System.out.println(k);
        }
        int longestCount =1;
        int count =0;
        int lastSmallest=Integer.MIN_VALUE;
        for(int i=0; i<n;i++)
        {
            if(arr[i]-1==lastSmallest)
            {
                count++;
                lastSmallest = arr[i];
            }
            else if(arr[i]!= lastSmallest) 
            {
                    count = 1;
                    lastSmallest = arr[i];
            }
            longestCount= Math.max(longestCount,count);
            System.out.println("longestCount:"+longestCount);
        }
        return longestCount;
    }
    public void setMatrixZero(int[][] matrix, int n, int m)
    {
        int[] row = new int[n];
        int[] column = new int[m];
        Arrays.fill(row,0);
        Arrays.fill(column, 0);

        for(int i =0; i<n; i++)
        {
            for(int j=0; j<m ; j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=1;
                    column[j]=1;
                }
            }
        }
        for(int i=0; i<n;i++)
        {
            for(int j=0; j<m;j++)
            {
                if(row[i]==1 || column[j]==1)
                {
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0; j<m;j++)
            {
                System.out.print(matrix[i][j]+",");
            }
            System.out.println("");
        }
    }
    public void rotate90(int[][] matrix, int n,int m)
    {
        int[][] ansMatrix = new int[n][m];
        int k=0;
        for(int j=0;j<m;j++)
        {
            int l=0;
            for(int i=n-1; i>=0;i-- )
            {
                ansMatrix[k][l]= matrix[i][j];
                l++;
            }
            k++;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0; j<m;j++)
            {
                System.out.print(ansMatrix[i][j]+",");
            }
            System.out.println("");
        }
    }
    public void countAllSubarray(int arr[],int n, int target)
    {
        int count =0;
        for(int i=0; i<n;i++)
        {
            int sum =0;
            for (int j=i; j<n;j++)
            {
                sum = sum+arr[j];
                if (sum==target)
                {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Number of such subarrays:"+count);
    }

    public static void main(String[] args) {
       ArrayAdvanceProblem aap = new ArrayAdvanceProblem();
       int[] arr = {3, 1, 2, 4};
       int target = 6;
        //aap.twoSum(arr, 4, target);
       // aap.mooreMajorityElement(arr, 7);
       //aap.leaderElement2(arr, 4);
       //aap.largestConsecutiveSeq(arr,6);
       int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        aap.rotate90(matrix,3,3);
        aap.countAllSubarray(arr, 4, 6);
    }
    
}
