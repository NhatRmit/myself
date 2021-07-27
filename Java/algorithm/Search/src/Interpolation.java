public class Interpolation {
    public static int interpolation(int[] arr, int lo, int hi, int x) {
        int pos;
        if (hi >= lo && arr[lo] <= x && x <= arr[hi]){
            pos = lo + (((hi-lo)/(arr[hi]-arr[lo]))*(x-arr[lo]));

            if(x == arr[pos]) {
                return pos;
            }

            //x on the right
            if(x > arr[pos]) {
                return interpolation(arr, pos+1, hi, x);
            }
            
            //x on the left
            if(x < arr[pos]) {
                return interpolation(arr, lo, pos-1, x);
            }

        }
        return -1;
    }

    public static void interpolationSearch(int[] arr, int lo, int hi, int x){
        int result = interpolation(arr, lo, hi, x);
        if(result == -1){
            System.out.println("Can not find the index of your value!");
        } else {
            System.out.printf("The value %d is at index %d\n", x, result);
        }
    }
}
