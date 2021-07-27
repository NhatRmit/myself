
public class Exponential {
    public static int exponential(int[] arr, int x){
        int pos=0;

        //x is at the first position
        if(x == arr[pos]) {
            return 0;
        }

        
        for(int i=1; i<arr.length; i++){
            if (x >= arr[i]){
                i = i*2;
                pos = Binary.binary(arr, i/2, Math.min(i, arr.length-1), x);
            }
        }

        return pos;
    }

    public static void exponentialSearch(int arr[], int x) {
        int result = exponential(arr, x);
        if(result == -1) {
            System.out.println("Your value is not valid!");
        } else {
            System.out.printf("The value %d is at index %d\n", x, result);
        }
    }
}
