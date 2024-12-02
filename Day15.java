/*  Implement Lower Bound:

 Problem statement==>
You are given an array 'arr' sorted in non-decreasing order and a number 'x'. You must return the index of the lower bound of 'x'.

Note:
1. For a sorted array 'arr', 'lower_bound' of a number 'x' is defined as the smallest index 'idx' such that the value 'arr[idx]' is not less than 'x'.If all numbers are smaller than 'x', then 'n' should be the 'lower_bound' of 'x', where 'n' is the size of array.
2. Try to do this in O(log(n)).

Example:
Input: ‘arr’ = [1, 2, 2, 3] and 'x' = 0
Output: 0
 */


 public class Day15 {
    public static int lowerBound(int []arr, int n, int x) {
       
        int low=0, high=n;

        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid] <x){
                low=mid+1;
                }
            else{
                high=mid;
            }
        }
        return low;
    }
}