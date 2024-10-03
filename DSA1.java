class DSA1
{
    public void pattern1(int row, int column)
    {
        for(int i= 0; i< row; i++)
        {
            for (int j =0; j<column; j++)
            {
                System.out.print("&");
            }
            
            System.out.println();
        }
    }
    public void pattern2(int row)
    {
        for(int i= 0; i< row; i++)
        {
            for (int j =0; j<i; j++)
            {
                System.out.print("&");
            }
            
            System.out.println();
        }
    }
    public void pattern3(int row)
    {
        for(int i= 1; i<=row; i++)
        {
            for (int j =1; j<=i; j++)
            {
                System.out.print( j + " ");
            }
            
            System.out.println();
        }
    }
    public void pattern4(int row)
    {
        for(int i= 1; i<=row; i++)
        {
            for (int j =1; j<=i; j++)
            {
                System.out.print( i + " ");
            }
            
            System.out.println();
        }
    }
    public void pattern5(int row)
    {
        for(int i= row; i>=1; i--)
        {
            for (int j =1; j<=i; j++)
            {
                System.out.print( '*' + " ");
            }
            
            System.out.println();
        }
    }
    public void pattern6(int row)
    {
        for(int i= row; i>=1; i--)
        {
            for (int j =1; j<=i; j++)
            {
                System.out.print( j + " ");
            }
            
            System.out.println();
        }
    }
    public void pattern7(int row)
    {
        for(int i= 0; i < row; i++)
        {
            for(int j = row-i; j>1; j--)
            {
                System.out.print( ' ' + " ");
            }
            for(int k = 0 ; k<2*i+1; k++)
            {
                System.out.print( '*' + " ");
            }
            for(int j = row-i; j>1; j--)
            {
                System.out.print( ' ' + " ");
            }
            System.out.println();
        }
    }
    public void pattern8(int row)
    {
        for(int i= 0; i <row; i++)
        {
            for(int j = 0; j< i; j++)
            {
                System.out.print( ' ' + " ");
            }
            for(int k = 0 ; k<2*(row-i)-1; k++)
            {
                System.out.print( '*' + " ");
            }
            for(int j = 0; j< i; j++)
            {
                System.out.print( ' ' + " ");
            }
            System.out.println();
        }
    }
    public void pattern9(int row)
    {
        for(int i= 0; i <2*row; i++)
        {
          if(i<row)  {
            System.out.print(i);
            for(int j = row-i; j>1; j--)
            {
                System.out.print( ' ' + " ");
            }
            for(int k = 0 ; k<2*i+1; k++)
            {
                System.out.print( '*' + " ");
            }
            for(int j = row-i; j>1; j--)
            {
                System.out.print( ' ' + " ");
            }
            System.out.println();
        }else {
            System.out.print(i);
            for(int j = 5; j< i; j++)
            {
                System.out.print( ' ' + " ");
            }
            for(int k = 1 ; k < 2*(row -i+5); k++)
            {
                System.out.print( '*' + " ");
            }
            for(int j = 5; j< i; j++)
            {
                System.out.print( ' ' + " ");
            }
            System.out.println();
        }
    }
    
    
    }
    
    public void pattern10(int row)
    {
        int star =0;

        for(int i= 1; i <=2*row -1; i++)
        { 
            star = i;
            if (i>row-1) star = 2*row -i;

            for(int k = 1 ; k<=star ; k++)
            {
                System.out.print( '*' + " ");
            }
            System.out.println();
        }
        
    }
    public void pattern11(int row)
    {

        for(int i= 1; i <= row ; i++)
        { 
            for(int k = 0 ; k<i ; k++)
            {
                System.out.print( (i+k)%2 + " ");
            }
            System.out.println();
        }
        
    }
    public void pattern12(int row)
    {

        for(int i= 1; i <= row ; i++)
        { 
            //number
            for(int k = 1 ; k<=i ; k++)
            {
                System.out.print( k + " ");
            }
            //space
            for(int k = 1 ; k<= 2*row -2*i ; k++)
            {
                System.out.print( ' ' + " ");
            } 
            //reverse number
            for(int k = i ; k>= 1 ; k--)
            {
                System.out.print( k + " ");
            }    

            System.out.println();

        }
        
    }
    public void pattern13(int row)
    {
        int num = 1;
        for(int i= 1; i <= row ; i++)
        { 
            
            for(int j = 0; j<i; j++)
            {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        
    }
    public void pattern14(int row)
    {
        for(int i= 1; i <= row ; i++)
        { 
            
            for(char c= 'A' ;c<'A'+i;  c++)
            {
                System.out.print( c+ " " );
               
            }
            System.out.println();
        }
        
    }
    public void pattern15(int row)
    {
        for(int i= 0; i < row ; i++)
        { 
            
            for(char c= 'A'; c<'A'+row-i;  c++)
            {
                System.out.print( c+ " " ); 
               
            }
            
            System.out.println();
        }
        
    }
    public void pattern16(int row)
    {
        for (char i= 'A';i< 'A'+row; i++)
        {   
            for(int c= 0; c<= i-'A';  c++)
            { 
                System.out.print( i + " " );   
            }
            System.out.println();
        }
        
    }
    public void pattern17(int row)
    {
        for (int i= 0;i<row; i++)
        {  
            char c= 'A' ;
            int breakpoint = (2*i)/2 + 1;
            //space
            for(int k = 1; k<row-i; k++)
            {
                System.out.print( ' ' + " " );   
            }
            //1st alphabet
            for(int j= 1; j<= 2*i+1;  j++)
            { 
                System.out.print(c  + " " );  
                if (j< breakpoint) 
                c++; //System.out.print("%");}
                else c--;//System.out.print("*");}
            }

            System.out.println();
        }
        
    }
    public void pattern18(int row)
    {
        for (int i= 0;i<row; i++)
        {  
            char c= (char) ('A'+ row-1-i) ;
           
            //1st alphabet
            for(char j= 0; j<= i;  j++)
            { 
                System.out.print(c+ " " );  
                c++;
                
            }

            System.out.println();
        }
        
    }
    public void pattern19(int row)
    {
        for (int i= 0;i<2*row; i++)
        {  
           if(i<row) {
            //1st star
            for(int j= row-i ; j> 0;  j--)
            { 
                System.out.print( '*' + " " );  
                
            }
            //space
            for(char j= 0; j< 2*i;  j++)
            { 
                System.out.print( ' ' + " " );  
                
            }
            //2nd star
            for(int j= 1; j<=row-i;  j++)
            { 
                System.out.print( '*' + " " );  
                
            }
            System.out.println();
        }else{
            //starts
             for(int j= 0 ; j<= i-row;  j++)
             { 
                 System.out.print( '*' + " " );  
                 
             }
             //space
            for(int j=2*row-2*(i-row)-2 ; j>0;  j--)
            {  
                System.out.print( ' '+ " " );  
            }
            //2nd star
            for(int j= 0; j<= (i-row);  j++)
            { 
                System.out.print( '*' + " " );  
                
            }
             System.out.println();
            }
            
        }
        
    }
    public void pattern20(int row)
    {
        for (int i= 0;i<2*row-1; i++)
        { 
           
           if(i<row) {
            //starts
            for(int j= 0 ; j<= i;  j++)
            { 
                System.out.print( '*' + " " );  
                
            }
            //space
           for(int j=2*(row-i)-2 ; j>0;  j--)
           {  
               System.out.print( ' '+ " " );  
           }
           //2nd star
           for(int j= 0; j<=i;  j++)
           { 
               System.out.print( '*' + " " );  
               
           }
            System.out.println();
        }else{
            //1st star
            for(int j= 2*row-i-1 ; j>0;  j--)
            { 
                System.out.print( '*' + " " );  
                
            }
            //space
            for(char j= 0; j<=2*(i-row)+1;  j++)
            { 
                System.out.print( ' ' + " " );  
                
            }
            //2nd star
            for(int j= 1; j<2*row-i;  j++)
            { 
                System.out.print( '*' + " " );  
                
            }
            System.out.println();
        }
    }
    }//for

    public void pattern21(int row)
    {
        for(int i=0; i<row; i++)
        {
            
            for (int j=0; j<row; j++)
            {
                if(i==0 || i==row-1) 
                System.out.print( '*' + " " );  
                else if ( j==0 || j==4)
                System.out.print( '*' + " " ); 
                else
                System.out.print( ' ' + " " );  
            }
            System.out.println();
        }

    }
    public void pattern22(int row)
    {
        

        for(int i=0; i<2*row-1; i++)
        {
            
            for (int j=0; j<2*row-1; j++)
            {
                int top = i;
                int right = j;
                int bottom = 2*row-2-i;
                int left = 2*row-2-j;
                System.out.print( row- Math.min(Math.min(top,right),Math.min(bottom,left) ));  
            }
            System.out.println();
        }

    }
        
    public static void main(String[] args) {
        //System.out.println("hello world");
        DSA1 dsa1 = new DSA1();
        dsa1.pattern22(5);
        //dsa1.pattern8(5);
    }
}

