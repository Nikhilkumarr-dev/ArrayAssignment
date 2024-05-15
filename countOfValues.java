package ArrayAssignment;

import java.util.*;
public class countOfValues 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of rows");

        int m=scan.nextInt();
        
        System.out.println("enter number of columns");

        int n=scan.nextInt();

        int arr[][] =new int[m][n];
        System.out.println("enter the matrix elements");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            { 
                arr[i][j]=scan.nextInt();    
            }    
        }
        int positive=0,negative=0,even=0,odd=0,zeroes=0;
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n  ;j++) 
            {
                if(arr[i][j]>0)
                {
                    positive++;
                } 
                if (arr[i][j]<0) 
                {
                    negative++;    
                }   
                if(arr[i][j]%2==0)
                {
                    even++;
                }  
                if (arr[i][j]%2 != 0) 
                {
                    odd++;    
                }
                if (arr[i][j]==0) 
                {
                    zeroes++;

                }          
            }
            
        }
      System.out.println("number of positive elements" + positive);
      System.out.println("nume=ber of negative elements" + negative);
      System.out.println("number of even numbers" + even);
      System.out.println("number of odd numbers" + odd);
      System.out.println("number of zeroes" + zeroes);
     
            
    }    
}
