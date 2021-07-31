public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the show!");
        int[] arr = {64,25,12,22,11,65,1,-1};
        
        System.out.println("SELECTION");
        Selection selection = new Selection();
        selection.selectionSort(arr);

        System.out.println("BUBBLE");
        Bubble bubble = new Bubble();
        bubble.bubbleSort(arr);

        
    }
}
