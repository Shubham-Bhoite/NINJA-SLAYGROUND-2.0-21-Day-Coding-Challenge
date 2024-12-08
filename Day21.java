/*  Number of Inversions:

 Problem statement==>
There is an integer array ‘A’ of size ‘N’.
Number of inversions in an array can be defined as the number of pairs of ‘i’, ‘j’ such that ‘i’ < ‘j’ and ‘A[i]’ > ‘A[j]’.
You must return the number of inversions in the array.

For example,
Input:
A = [5, 3, 2, 1, 4], N = 5
Output:
7 
*/

public class Day21 {
    public static int numberOfInversions(int[] a, int n) {
        return mergeSortAndCount(a, 0, n - 1);
    }

    private static int mergeSortAndCount(int[] arr, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Count inversions in the left half
            count += mergeSortAndCount(arr, left, mid);

            // Count inversions in the right half
            count += mergeSortAndCount(arr, mid + 1, right);

            // Count and merge inversions across the two halves
            count += mergeAndCount(arr, left, mid, right);
        }
        return count;
    }

    private static int mergeAndCount(int[] arr, int left, int mid, int right) {
        int[] leftArray = new int[mid - left + 1];
        int[] rightArray = new int[right - mid];

        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = arr[left + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = left, inversions = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
                // All remaining elements in leftArray form an inversion
                inversions += (leftArray.length - i);
            }
        }

        // Copy remaining elements of leftArray (if any)
        while (i < leftArray.length)
            arr[k++] = leftArray[i++];

        // Copy remaining elements of rightArray (if any)
        while (j < rightArray.length)
            arr[k++] = rightArray[j++];

        return inversions;
    }
}
