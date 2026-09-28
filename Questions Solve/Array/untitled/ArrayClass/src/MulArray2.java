import java.lang.reflect.Array;

public class MulArray2 {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int c = 2;
        for(int i=0; i<arr.length;i++){
            int n = arr[i];
            arr[i] = n*c;
        }

        for(int a: arr){
            System.out.print(a + " ");
        }
//2 4 6 8 10 12 14 16 18 20
    }
}
