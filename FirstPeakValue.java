// time complexity is O(n)
// space complexity is O(1)
package ArrayAssignment;

public class FirstPeakValue {
    public static void main(String[] args) {
        int arr[]={1,3,2,6,5};
        int n =arr.length;
        for (int i = 1; i < n-1; i++) 
        {
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1])
            {
                System.out.println(arr[i]);
                break;
                
            }
        }
    }
}
