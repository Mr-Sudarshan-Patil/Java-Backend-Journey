/*

Given an integer n. Write a program to print the Right angle triangle. The length of the perpendicular and base is n.  

Examples :

Input: n = 9
Output:
*
* *
*   *
*     *
*       *
*         *
*           *
*             *
* * * * * * * * * 
Explanation: Length of perpendicular and base of triangle is 9.

*/

class RightAngleTriangle {
    public static void main(String args[]) {
		int n = 10;
        for(int i = 1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if(i == 1 || i==n || j==1 || j==i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}