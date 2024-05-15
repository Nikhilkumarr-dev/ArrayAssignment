
//  time complexity is O(m*n)
// space complexity is O(1)
package ArrayAssignment;

public class valuesAboveSecondaryDiagonal {
    public static void main(String[] args) {
         
        int arr[][]={{1,2,3,-6},{4,5,6,-1},{7,8,9,-1},{10,-1,3,15}};
        int m=arr.length;
        int n=arr[0].length;

        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if((i+j)<n-1)
                {
                    System.out.println(arr[i][j]);
                }


                
            }    
        }

        System.out.println(" ");
    }
}

