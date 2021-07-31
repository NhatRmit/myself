package rmit;
import java.util.Scanner;
public class Exe {
    public static void main(String[] args) {

        String reverse_text = reverse("Nhat");
        System.out.println(reverse_text);

        pattern_5();
        
    }

    /**
     * REVERSE
     * 1/ Using array to store each char 
     * 2/ For loop to take char put into the array, using charAt() 
     * 3/ Declare an empty String to store the reverse string
     * 4/ For loop to add each char into the empty String
     * 5/ return a String
     */
    public static String reverse(String s){
        // step 1
        char[] r = new char[s.length()];
        int charIndex = 0;

        //step 2
        for (int i=s.length()-1; i>=0; i--){
            r[charIndex] = s.charAt(i);
            charIndex++;
        }

        //step 3
        String reverse = "";

        //step 4
        for(int i=0; i<r.length; i++){
            reverse = reverse + r[i];
        }

        //step 5
        return reverse;
    }

    /**
     * Pattern
     *    *
     *    **
     *    ***
     *    **
     *    *
     * 1/ using scanner to ask user input 
     * 2/ Using nested loop => i for the row, j for the column to print small number to high number
     * 3/ note j must be less than i
     * 4/ Using nested loop reverse => i for the row, j for the column to print high number to small number
     */
    public static void pattern_0() {
        //Step 1
        Scanner s = new Scanner(System.in);
        System.out.print("How many stars would make you happy? ");
        int stars = s.nextInt();

        //Step 2
        for(int i=1; i<=stars; i++){
            //Step 3
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Step 4
        for(int i=stars-1; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        s.close();
    }

    /**
     * Pattern
     *    *
     *    **
     *    ***
     * 1/ using scanner to ask user input 
     * 2/ Using nested loop => i for the row, j for the column to print small number to high number
     * 3/ note j must be less than i
     */

    public static void pattern_1(){
        //Step 1
        Scanner s = new Scanner(System.in);
        System.out.print("How many stars would make you smile? ");
        int stars = s.nextInt();
        
        //Step 2
        for(int i=1; i<=stars; i++){
            //Step 3
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        s.close();
    }

    /**
     * Pattern
     *    ***
     *    ***
     *    ***
     * 1/ using scanner to ask user input 
     * 2/ Using nested loop => i for the row, j for the column to print small number to high number
     * 
     */

    public static void pattern_2() {
        Scanner s = new Scanner(System.in);
        System.out.print("How many stars would you hold my hand? ");
        int stars = s.nextInt();

        for(int i=0; i<stars; i++){
            for(int j=0; j<stars; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        s.close();
    }

    /**
     * Pattern
     *    ***
     *    * *
     *    ***
     * 1/ using scanner to ask user input 
     * 2/ Using nested loop => i for the row, j for the column to print small number to high number
     * 
     */
    public static void pattern_3(){
        Scanner s = new Scanner(System.in);
        System.out.print("How many stars would you stop crying? ");
        int stars = s.nextInt();

        for(int i=0; i<stars; i++){
            for(int j=0; j<stars; j++){            
                if(j==0 || j==stars-1 || i==0 || i==stars-1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        s.close();
    }

    /**
     * Pattern
     *    ***
     *    **
     *    *
     * 1/ using scanner to ask user input 
     * 2/ Using nested loop => i for the row, j for the column to print small number to high number
     * 
     */
    public static void pattern_4(){
        Scanner s = new Scanner(System.in);
        System.out.print("Would you like to have my stars? ");
        int stars = s.nextInt();

        for(int i=1; i<=stars; i++){
            for(int j=stars-1; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        s.close();
    }

        /**
     * Pattern
     *      *
     *     **
     *    ***
     * 1/ using scanner to ask user input 
     * 2/ Using nested loop => i for the row, j for the column to print small number to high number
     * 
     */
    public static void pattern_5(){
        Scanner s = new Scanner(System.in);
        System.out.print("Would you like to have my stars? ");
        int stars = s.nextInt();

        for(int i=0; i<stars; i++){
            System.out.print(" ");
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        s.close();
    }

}
