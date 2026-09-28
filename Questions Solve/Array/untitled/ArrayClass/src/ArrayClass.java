import java.util.Scanner;

public class ArrayClass {
    public static void main(String args[])
    {
        int arr[] = new int[5];
        //type arrayname[] = initialize the memory size
        //type[] arrayname = initialize the values
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int num: arr){
            System.out.println(num);
        }
    }
}
