/*  Reverse a Number :

 Problem statement ==>
You are given a number 'n'.
Return an integer that is the reverse of ‘n’.
Note:
Reverse of ‘n’ means an integer where, the most significant digit of ‘n’ is the least significant digit of the number, the second most significant digit of ‘n’ is the second least significant digit of the number and so on.

Example:
Input: 'n' = 123
Output: 321
Explanation:
Reverse of 'n' = 123 is 321.
 */


 public class Day6 {
    public static int reverseNumber(int n) {
        int reversed =0;

        while(n>0){
            int digit = n%10;
            reversed = reversed*10 + digit;
            n=n/10;
        }
        return reversed;
    }
}