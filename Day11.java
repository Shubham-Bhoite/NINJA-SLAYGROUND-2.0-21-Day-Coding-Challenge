/*  Two Sum :

 Problem statement ==>
Sam want to read exactly ‘TARGET’ number of pages.
He has an array ‘BOOK’ containing the number of pages for ‘N’ books.
Return YES/NO, if it is possible for him to read any 2 books and he can meet his ‘TARGET’ number of pages.

Example:
Input: ‘N’ = 5, ‘TARGET’ = 5
‘BOOK’ = [4, 1, 2, 3, 1] 
Output: YES
Explanation:
Sam can buy 4 pages book and 1 page book 
*/

import java.util.HashSet;
public class Day11 {
    public static String read(int n, int []book, int target){
        
        HashSet<Integer> set =new HashSet<>();

        for(int pages:book)
        {
            int diff = target - pages;
            if(set.contains(diff)){
                return "YES";
            }
            set.add(pages);
        }
        return "NO";
    }
}
