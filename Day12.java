/* Add One To Number:

 Problem statement ==>
Given a non-negative number represented as an array of digits, you have to add 1 to the number, i.e, increment the given number by one.
The digits are stored such that the most significant digit is at the starting of the array and the least significant digit is at the end of the array.

Example:
If the given array is {1,5,2}, the returned array should be {1,5,3}.
Note:
Input array can contain leading zeros, but the output array should not contain any leading zeros (even if the input array contains leading zeroes).
For Example: 
If the given array is {0,2}, the returned array should be {3}. 

*/


import java.util.* ;
import java.io.*; 
public class Day12
{
    public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr)
    {
        int n = arr.size();
        int carry = 1;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {
            int sum = arr.get(i) + carry;
            result.add(sum % 10); 
            carry = sum / 10; 
        }

        if(carry > 0 ){
            result.add(carry);
        }
        Collections.reverse(result);
        while (result.size() > 1 && result.get(0) == 0) {
            result.remove(0);
        }
        return result;
    }
}