package rmit;
import java.util.Scanner;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.next();
        
        int[] res = hardMethod(str);
        System.out.println(Arrays.toString(res));
    }

    public static int[] hardMethod(String s) {
        int[] arr = new int[2];
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int uppercaseResult = 0;
        int lowercaseResult = 0;

        //Convert string into character array
        char[] charList = s.toCharArray();

        for (int i = 0; i < charList.length; i++) {
            //Check each character whether it is uppercase
            if (Character.isUpperCase(charList[i])) {
                uppercaseCount++; //if uppercase character is found, increment count
                uppercaseResult = Math.max(uppercaseResult, uppercaseCount); //compare upperCount with maximum so far
            } else {
                uppercaseCount = 0; //if we see lowercase, we reset count as 0
            }

            //Check each character whether it is lowercase
            if (Character.isLowerCase(charList[i])) {
                lowercaseCount++;
                lowercaseResult = Math.max(lowercaseResult, lowercaseCount);
            } else {
                lowercaseCount = 0;
            }
        }
        arr[0] = lowercaseResult;
        arr[1] = uppercaseResult;
        return arr;
    }

}






