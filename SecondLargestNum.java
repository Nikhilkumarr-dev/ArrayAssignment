package ArrayAssignment;
// time complexity is:O(n)
// space complexity is:O(1)
public class SecondLargestNum {
    public static void main(String[] args) 
    {
        int arr[]={34,21,54,65,43};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        // max 1 is the first largest number in an array
        // max2 is the second largest number in an array
        for (int num : arr) 
        {
         max1=Math.max(max1, num);    
        }
        
        for(int num :arr)
        {
            if(num != max1)
            {
                max2=Math.max(max2, num);
            }
        }
        if(max2==Integer.MIN_VALUE)
        {
            System.out.println("there is no second largest number");

        }
        else
        {
            System.out.println("the second largest number is " +  max2);
        }
    }
}

