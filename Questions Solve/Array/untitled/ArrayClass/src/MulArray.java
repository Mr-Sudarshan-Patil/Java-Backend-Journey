public class MulArray {
    public static void main(String args[]){
        int arr[] = {2,3,10,20};
        int ans = 1;
        for(int n:arr){
            ans = ans*n;
        }
        System.out.println("Product of array: " + ans);
     }
}
