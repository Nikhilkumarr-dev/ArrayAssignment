
// time complexity is O(n)
// space complexity is O(1)
package ArrayAssignment;
public class SumOfEvenIndices {
    public static void main(String[] args) {
        int sum=0;
        int arr[]={3,20,4,6,9};
        int i=0;
        int n=arr.length;
        while (i<n) 
        {
            sum += arr[i];
            i +=2;    
        }
        System.out.println(sum);
    }
}
