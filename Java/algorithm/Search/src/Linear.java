/*
Approaching
    1. For loop to start checking x with elements in arr from left
    2. If condition to return index if x matches, otherwise => -1
*/

public class Linear {
    public static int linear(int[] arr, int x){
        for (int i=0; i<arr.length; i++){
            if(arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void linearSearch(int[] arr, int x) {
        int result = linear(arr, x);
        if (result == -1){
            System.out.println("There is no result for your input!");
        } else {
            System.out.println("The value " + x + " is at index " + result);
        }
    }
}