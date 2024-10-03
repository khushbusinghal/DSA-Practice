import java.lang.reflect.Array;
import java.util.Arrays;

public class Recursion {
    int counter = 1;
    public void printName(int times,String name)
    { 
        if(counter <= times)
        {
            System.out.println(name);
            counter++;
            printName(times, name);
        }
    }
    public void printNumber(int times)
    { 
        if(counter <= times)
        {
            System.out.println(counter);
            counter++;
            printNumber(times);
        }
    }
    public void sumNumber(int number, int sum)
    {
        //System.out.println("func called with number: "+ number  +" counter:: "+ counter);
        if(counter <= number)
        {
           // System.out.println(number + ","+sum+ ","+counter);
            sum = sum + counter;
           // System.out.println("line 2: sum: "+ sum);
            counter++;
            sumNumber(number,sum);
        }
        else
        System.out.println("sum:"+ sum);
    }
    public void factorialNumber(int number, int sum)
    {
        System.out.println("func called with number: "+ number  +" counter:: "+ counter);
        if(counter <= number)
        {
           System.out.println(number + ","+sum+ ","+counter);
            sum = sum * counter;
           System.out.println("line 2: sum: "+ sum);
            counter++;
            factorialNumber(number,sum);
        }
        else
        System.out.println("factorial:"+ sum);
    }
    public int factorial(int num)
    {
        int factorial = 1;
        if(num >1)
        {
            factorial = num * factorial(num-1);
        }
       
        return factorial;
    }
    public int[] reverseArr(int[] arr,int startIndex, int endIndex)
    {
        if(startIndex< endIndex)
        {
            int temp = arr[endIndex];
            arr[endIndex]=arr[startIndex];
            arr[startIndex]= temp;
            reverseArr(arr, startIndex+1,endIndex-1);
        }
       return arr;
    }
    public boolean checkPalindrom(String str,int i)
    {
        int n=str.length();
       if(i>n/2)
       {
            return true;
       }
       else if(str.charAt(i)!= str.charAt(n-i-1))
        {
            return false;
        }
        else
        {
            return checkPalindrom(str, i+1);
        }
       
    }
    public int fib(int n)
    {
        if (n==0)
        return 0;
        else if (n==1)
        return 1;
        else if (n<0)
        return 0;
        else
            return fib(n-2)+ fib(n-1);
       
    }
    public static void main(String[] args) {
        Recursion rc = new Recursion();
        String array = "MadaM";
        //rc.checkPalindrom(array,0);
        System.out.println("factorial:"+rc.fib(3));
       
    }
    
}
