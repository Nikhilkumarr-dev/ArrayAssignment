// time complexity is O(m) if n<m or O(n) if m<n
// space complesity is O(1)
package ArrayAssignment;
public class DisplayMiddleRowCol {
    public static void main(String[] args) {
       int[][] arr ={{1,2,3,4,5},{3,4,5,6,7},{7,6,5,4,3},{8,7,6,5,4},{1,2,37,8,0}};
       int m =arr.length;
       int n=arr[0].length;
        // midlle column values
       for (int i = 0; i < m; i++) 
       {
        System.out.println(arr[i][m/2] + " "); 
       }
    //    middle row values
       for(int j=0;j<n;j++)
       {
        if(j==n/2)
        {
            continue;
        }
        System.out.println(arr[m/2][j] + " ");
       }

    }
}
