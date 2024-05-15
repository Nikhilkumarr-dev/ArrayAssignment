
// optimal approach
// tiem complexity is O(n)
// space complexit is O(1)

// brute force approcah
// time complexity O(m*n)
// space complexity is O(1)
package ArrayAssignment;
public class DisplayPrimeSecondDiag {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,-1},{4,5,6,-2},{7,8,9,-3},{10,11,12,-4}};
        int m=arr.length;
        int n=arr[0].length;
        /*for (int i = 0; i < m; i++) 
        {
            for (int j = 0;j<n;j++) 
            {
                if(i==j)
                {
                    System.out.println(arr[i][j] + " ");
                } 
                else if(i+j==n-1)
                {
                    System.out.println(arr[i][j]);
                }   
            }    
        }
        System.out.println(" ");
        */

        for (int i = 0; i < m; i++) 
        {
            System.out.println(arr[i][i] + " "); 
            if (i != n-1-i)
            {
                System.out.println(arr[i][n-1-i]);
            }   
        }
    }

}