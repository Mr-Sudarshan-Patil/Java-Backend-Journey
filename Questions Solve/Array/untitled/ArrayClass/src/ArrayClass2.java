public class ArrayClass2 {
    public static void main(String args[]){
        int arr[] = {10, 20, 30, 50, 46};

        int sum = 0;
        for(int n: arr){
            sum += n;
        }
        System.out.println("Total sum is :" + sum);
    }
}
