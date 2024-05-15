//time complexity is O(n)
//space complexity is O(1)
package ArrayAssignment;

public class maxElementFind {
    public static void main(String[] args) {
        int arr[]={34,21,54,65,43};
        int max=Integer.MIN_VALUE;
        for (int num : arr) 
        {
         max=Math.max(max,num);   
        }
        System.out.println(max);
    }
}
