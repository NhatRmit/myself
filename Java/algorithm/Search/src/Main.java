public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the show! SEARCH ALGO");
        int[] arr = { 2, 3, 4, 10, 40 };
        int x  = 2;
        
        System.out.println("LINEAR");
        Linear.linearSearch(arr, x);

        System.out.println("BINARY");
        Binary.binarySearch(arr, 0, arr.length-1, x);

        System.out.println("JUMP");
        Jump.jumpSearch(arr, x);

        System.out.println("INTERPOLATION");
        Interpolation.interpolationSearch(arr, 0, arr.length-1, x);
        
        System.out.println("EXPONENTIAL");
        Exponential.exponentialSearch(arr, x);
        
        System.out.println("TERNARY");
        Ternary.ternarySearch(arr, 0, arr.length-1, x);
    }
}
