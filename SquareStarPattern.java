//patern-1
//           ****
//           ****
//           ****
//           ****
//Patern-2

//   ****
//   *  *
//   *  *
//   ****



package Patterns;

import java.util.Scanner;

public class SquareStarPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //Pattern 1
        pattern1(num);
        pattern2(num);
    }

    static void pattern1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //method for pattern 2
    static void pattern2(int n){
        for(int i=1; i<=n; i++){
            String str = "";
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    str = str + "*";
                }
                str = str+"  ";
//              System.out.print(" ");
            }
            System.out.println(str);
        }
    }
}
