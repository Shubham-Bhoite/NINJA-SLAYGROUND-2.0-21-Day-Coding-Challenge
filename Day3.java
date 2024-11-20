/*  Number of digits :

Problem statement ==>
You are given a number 'n'.
Return number of digits in ‘n’.

Example:
Input: 'n' = 123
Output: 3
Explanation:
The 3 digits in ‘123’ are 1, 2 and 3. 
*/ 


public class Day3 {
    public static int countDigits(int n){
        
        return (int) Math.log10(n) + 1;
    }
}