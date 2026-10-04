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
        pattern3(num);
        pattern4(num);
        pattern5(num);
        pattern6(num);
        pattern7(num);
        pattern8(num);
        pattern9(num);
        pattern10(num);
        pattern11(num);
        pattern12(num);
        pattern13(num);
        pattern14(num);
        pattern15(num);
        pattern16(num);
        pattern17(num);
    }

    static void pattern1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\n");
    }

    //method for pattern 2
    static void pattern2(int n){
        for(int i=1; i<=n; i++){
            String str = "";
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    str = str + "*";
                }
                else{
                    str = str+" ";
                }
//              System.out.print(" ");
            }
            System.out.println(str);
        }
        System.out.println("\n");
    }

    static void pattern3(int n){
//           ****
//            ****
//             ****
//              ****

        for(int i=0; i<n; i++){
            String str ="";
            for(int j=0; j<i; j++){
                str = str + " ";
            }
            for(int k=0; k<n; k++){
                str = str + "* ";
            }
            System.out.println(str);
        }

    }

    static void pattern4(int n){
//           *
//           **
//           ***
//           ****
        for(int i=1; i<=n; i++){
            String str = "";
            for(int j = 1; j<=i; j++){
                str += "*";
            }
            System.out.println(str);
        }
    System.out.println();
    }


    static void pattern5(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern6(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }


    static void pattern7(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern8(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern9(int n){
        int count = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern10(int n){
        for(int i=1; i<=n; i++){
            int start = 1;
            if(i%2==0){
                start = 0;
            }else{
                start = 1;
            }
            for(int j=1; j<=i; j++){
                if(start == 0) {
                    System.out.print("0");
                    start = 1;
                }else{
                    System.out.print("1");
                    start = 0;
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern11(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=i; k>=1; k--) {
                System.out.print(k);
            }
            if(!(i==1)){
                for(int x=2; x<=i; x++){
                    System.out.print(x);
                }
            }
            System.out.println();
        }
    }


    static void pattern12(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int x=n-1; x>=1; x--){
            for(int y=n; y>x; y--){
                System.out.print(" ");
            }
            for(int z=1; z<=x; z++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }


    static void pattern13(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                if(k==1 || k==i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int x=n-1; x>=1; x--){
            for(int y=n; y>x; y--){
                System.out.print(" ");
            }
            for(int z=1; z<=x; z++){
                if(z==1 || z==x){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern14(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int k=i; k<=n; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
        for(int x=1; x<=n-1;x++){
            for(int y=1; y<=n-x-1; y++){
                System.out.print(" ");
            }
            for(int z=n-x; z<=n; z++){
                System.out.print(z + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern15(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int k=i; k<=n; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int x=1; x<=n-1;x++){
            for(int y=1; y<=n-x-1; y++){
                System.out.print(" ");
            }
            for(int z=n-x; z<=n; z++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern16(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int k=i; k<=n; k++){
                if(i==1 || i==n || k==i || k==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int x=1; x<=n-1;x++){
            for(int y=1; y<=n-x-1; y++){
                System.out.print(" ");
            }
            for(int z=n-x; z<=n; z++){
                if(x==1 || x==n-1 || z==n-x || z==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern17(int n){
        for(int i=4; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2; i<=n-1; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
