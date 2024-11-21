/*  Prime Number :

 Problem statement ==>
A prime number is a positive integer that is divisible by exactly 2 integers, 1 and the number itself.
You are given a number 'n'.
Find out whether 'n' is prime or not.

Example :
Input: 'n' = 5
Output: YES
Explanation: 5 is only divisible by 1 and 5. 2, 3 and 4 do not divide 5.
 */


 public class Day4 {
    public static boolean isPrime(int n) {
        
        if(n<=1) return false;
        if(n == 2) return true;

        for(int i=2; i*i <= n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}