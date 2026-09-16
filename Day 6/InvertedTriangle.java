/*
Given an integer n. Write a program to print the inverted "Right angle triangle" wall. The length of the perpendicular and base is n.

Examples:

Input: n = 5
Output:
*****
****
*** 
**
*
Explanation: Length of perpendicular and base of triangle is 5.
Input: n = 3
Output:
*** 
** 
*
Explanation: Length of perpendicular and base of triangle is 3.
*/

import java.util.Scanner;

class InvertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}