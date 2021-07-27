public class Jump {
    public static int jump(int[] arr, int x){
        //find the step
        int step = (int)Math.floor(Math.sqrt(arr.length));

        //check if element x is in the array (run step)
        int prev = 0;
        while (x > arr[Math.min(step, arr.length)-1]){
            prev = step;
            step += (int)Math.floor(Math.sqrt(arr.length));
            if(prev >= arr.length) {
                return -1;
            }
        }

        //Doing a linear for x in block beginning with prev
        while(x > arr[prev]){
            prev++;    
            //if prev enter next block or reach end of array => element is not valid
            if(prev == Math.min(step, arr.length)){
                return -1;
            }
        }

        //check x is found
        if(x == arr[prev]) {
            return prev;
        }

        return -1;
    }

    public static void jumpSearch(int[] arr, int x) {
        int result = jump(arr, x);
        if(result == -1){
            System.out.println("Your input can not be found!");
        } else {
            System.out.printf("The value %d is at index %d\n", x, result);
        }
    }
}
