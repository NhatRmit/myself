public class Bubble {
    public Bubble(){}
    public void bubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                //check the next number > x
                if(arr[j] > arr[j+1]){
                    //swap next number with x
                    swap(arr[j+1], arr[j]);
                }
            }
        }
        for(int i : arr){
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    public int swap(int min, int max){
        int temp = max;
        max = min;
        min = temp;
        return min;
    }
}
