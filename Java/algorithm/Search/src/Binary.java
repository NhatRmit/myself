/*
Approaching
    1. Compare x with the M element
    2. If x == M => return index of M
    3. Else if x > M => recur the right half
    4. Else x < M => recur the left half    
*/

public class Binary {
    //check position of x and valid x
    public static int binary(int[] arr, int low, int high, int x){
        if (high >= low) {
            int mid = low + (high-low)/2;

            //if x is at the mid index
            if (arr[mid]==x){
                return mid;
            }

            //if x is smaller than mid (x in the left)
            if (x < arr[mid]) {
                return binary(arr, low, mid-1, x);
            } else { 
                //if x greater than mid (x in the right)
                return binary(arr, mid+1, high, x);
            }
        }
        return -1;
    }

    public static void binarySearch(int[] arr, int l, int r, int x) {
        int result = binary(arr, 0, arr.length-1, x);
        if( result == -1 ){
            System.out.println("Your input is none in the list!");
        } else {
            System.out.printf("The value %d is at index %d\n", x, result);
        }
    }   
}
