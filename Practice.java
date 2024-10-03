public class Practice {

    public void countDigits(int number)
    {
        int num = number;
        int count = 0;
        while(num !=0)
        {
            num = num / 10;
            count++;
        }
        System.out.println("Digits: "+count);
    }
    public void reverseNum(int num)

    {
        int revNum = 0;
        while(num != 0)
        {
            int lastNum = num%10;
            revNum = revNum * 10 + lastNum;
            num = num /10;
            
        }
        System.out.println("revNum: "+revNum);
    }
    public void checkPalindrom(int num)
    {
        int number = num;
        int revNum = 0;
        while(number != 0)
        {
            int lastNum = number%10;
            revNum = revNum * 10 + lastNum;
            number = number /10;
            
        }
        if (num == revNum)
        {
            System.out.println("It is a palindrom");
        }
        else
        System.out.println("It is not a palindrom");
    }
    public void checkArmstrongNum(int num)
    {
        int number = num;
        int armNum = 0;
        while(number != 0)
        {
            int lastNum = number%10;
            armNum = armNum + lastNum*lastNum*lastNum;
            number = number /10;
            
        }
        if (num == armNum)
        {
            System.out.println("It is a armstrong");
        }
        else
        System.out.println("It is not a armstrong");
    }
    public void printAllDivisor(int num)
    {
        for(int i=1;  i<= num; i++)
        {
            if (num % i==0)
            {
                System.out.println("Divisor number "+  i);
            }
        }
    }
    public void checkPrime(int num)
    {
        int count = 0;
        for(int i=1;  i<= num; i++)
        {
            if (num % i==0)
            {
                count++;
            }
        }
        if (count==2)
        System.out.println(num +" is a Prime Number.");
        else
        System.out.println(num +" is not a Prime Number.");
    }
    public void checkGCD(int num1, int num2)
    {
        int gcd = 1;
        for(int i=1;  i<= Math.min(num1,num2); i++)
        {
            if (num1%i ==0 && num2 %i ==0 )
            {
                gcd=i;
            }
        }
        
        System.out.println("GCD for "+ num1 +" and "+ num2 +" is " + gcd +".");
       
        
        
    }


    public static void main(String[] args) {
        Practice pr = new Practice();
        pr.checkGCD(9,12);
        
    }
    
}
