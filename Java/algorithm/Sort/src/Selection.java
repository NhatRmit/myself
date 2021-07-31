public class Selection {
    public Selection(){}

    public void selectionSort(int[] arr){
        //1 by 1 move boundary of unsorted subarr
        for (int i=0; i<arr.length; i++){

            //find min in unsorted arr
            int min_i = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min_i]){
                    min_i = j; //min index
                } 
            }

            //swap the found min with the first
            int temp = arr[min_i];
            arr[min_i] = arr[i];
            arr[i] = temp;
        }

        for(int i : arr){
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
