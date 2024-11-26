/* Second Largest Number :
 
Problem statement ==>
You have been given an array ‘a’ of ‘n’ unique non-negative integers.
Find the second largest and second smallest element from the array.
Return the two elements (second largest and second smallest) as another array of size 2

Example :
Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
Output: [4, 2]
The second largest element after 5 is 4, and the second smallest element after 1 is 2.
 */


 public class Day9 {
    public static int[] getSecondOrderElements(int n, int[] a) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int num : a) {
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
        }

        for (int num : a) {
            if (num > secondLargest && num < largest) secondLargest = num;
            if (num < secondSmallest && num > smallest) secondSmallest = num;
        }

        return new int[] {secondLargest, secondSmallest};
    }
}
