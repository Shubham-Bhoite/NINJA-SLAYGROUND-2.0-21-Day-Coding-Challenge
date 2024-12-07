/*  Pascal's Triangle :

 Problem statement==>
You are given an integer N. Your task is to return a 2-D ArrayList containing the pascal’s triangle till the row N.
A Pascal's triangle is a triangular array constructed by summing adjacent elements in preceding rows. Pascal's triangle contains the values of the binomial coefficient. 

For example, given integer N= 4 then you have to print.
1  
1 1 
1 2 1 
1 3 3 1

Here for the third row, you will see that the second element is the summation of the above two-row elements i.e. 2=1+1, and similarly for row three 3 = 1+2 and 3 = 1+2.
*/

import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Day20 {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
				 ArrayList<ArrayList<Long>> pascalTriangle = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Long> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1L);
                } else {
                    long value = pascalTriangle.get(i - 1).get(j - 1) + pascalTriangle.get(i - 1).get(j);
                    row.add(value);
                }
            }
            pascalTriangle.add(row);
        }
        return pascalTriangle;
    }

    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Long>> result = printPascal(n);
        for (ArrayList<Long> row : result) {
            for (Long num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
	}
}
