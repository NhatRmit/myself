public class Ternary {
    public static int ternary(int[] arr, int lo, int hi, int x){
        if(hi >= lo){
            int mid1 = lo + (hi-lo)/3;
            int mid2 = mid1 + (hi-lo)/3;
            
            //check x is at position mid1
            if(x == arr[mid1]) return mid1;

            //check x is at position mid2
            if(x == arr[mid2]) return mid2;

            //check x is at the first area (lo -> mid1)
            if(x < arr[mid1]) return ternary(arr, lo, mid1-1, x);

            //check x is at the second area (mid1 -> mid2)
            if(arr[mid1] <= x && x <= arr[mid2]) return ternary(arr, mid1+1, mid2-1, x);

            //check x is at the third area (mid2 -> hi)
            if(x > arr[mid2]) return ternary(arr, mid2+1, hi, x);
        }
        return -1;
    }

    public static void ternarySearch(int[] arr, int lo, int hi, int x){
        int result = ternary(arr, lo, hi, x);
        if(result == -1){
            System.out.println("Your value is not valid!");
        } else {
            System.out.printf("The value %d is at index %d\n", x, result);
        }
    }
}
