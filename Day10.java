/* Highest / Lowest Frequency Elements:

Problem statement ==>
Given an array 'v' of 'n' numbers.
Your task is to find and return the highest and lowest frequency elements.
If there are multiple elements that have the highest frequency or lowest frequency, pick the smallest element.

Example:
Input: ‘n' = 6, 'v' = [1, 2, 3, 1, 1, 4]
Output: 1 2 
*/


import java.util.*;

public class Day10 {
    public static int[] getFrequencies(int[] v) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : v) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE, minFreq = Integer.MAX_VALUE;
        int maxFreqElement = Integer.MAX_VALUE, minFreqElement = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFreq || (frequency == maxFreq && element < maxFreqElement)) {
                maxFreq = frequency;
                maxFreqElement = element;
            }

            if (frequency < minFreq || (frequency == minFreq && element < minFreqElement)) {
                minFreq = frequency;
                minFreqElement = element;
            }
        }

        return new int[]{maxFreqElement, minFreqElement};
    }
}
