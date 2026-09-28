public class MinArray {
    public static void main(String args[])
    {
        int arr[] = {2,34,4,2,96,3};
        int min = arr[0];

        for(int i=1; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("Smallest Number in Array: " + min);

    }
}
