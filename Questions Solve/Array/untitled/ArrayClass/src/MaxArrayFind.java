public class MaxArrayFind
{
    public static void main(String args[])
    {
        int arr[] = {2,34,4,2,96,3};
        int max = arr[0];

        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("Max Number in Array: " + max);

    }
}
