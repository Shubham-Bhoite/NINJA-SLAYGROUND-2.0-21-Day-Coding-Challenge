/*  Zero Matrix:

 Problem statement==>
You are given a matrix 'MATRIX' of dimension 'N' x 'M'. Your task is to make all the elements of row 'i' and column 'j' equal to 0 if any element in the ith row or jth column of the matrix is 0.
Note:
1) The number of rows should be at least 1.
2) The number of columns should be at least 1.
 */


 import java.util.* ;
 import java.io.*; 
 
 public class Day19 {
     public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
         boolean firstRowHasZero = false;
         boolean firstColHasZero = false;
 
         for (int i = 0; i < n; i++) {
             if (matrix.get(i).get(0) == 0) {
                 firstColHasZero = true;
                 break;
             }
         }
 
         for (int j = 0; j < m; j++) {
             if (matrix.get(0).get(j) == 0) {
                 firstRowHasZero = true;
                 break;
             }
         }
 
         for (int i = 1; i < n; i++) {
             for (int j = 1; j < m; j++) {
                 if (matrix.get(i).get(j) == 0) {
                     matrix.get(i).set(0, 0);
                     matrix.get(0).set(j, 0);
                 }
             }
         }
 
         for (int i = 1; i < n; i++) {
             if (matrix.get(i).get(0) == 0) {
                 for (int j = 1; j < m; j++) {
                     matrix.get(i).set(j, 0);
                 }
             }
         }
 
         for (int j = 1; j < m; j++) {
             if (matrix.get(0).get(j) == 0) {
                 for (int i = 1; i < n; i++) {
                     matrix.get(i).set(j, 0);
                 }
             }
         }
 
         if (firstRowHasZero) {
             for (int j = 0; j < m; j++) {
                 matrix.get(0).set(j, 0);
             }
         }
 
         if (firstColHasZero) {
             for (int i = 0; i < n; i++) {
                 matrix.get(i).set(0, 0);
             }
         }
 
         return matrix;
     }
 }
 