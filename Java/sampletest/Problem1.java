package Java.sampletest;
import java.util.Arrays;
public class Problem1 {
    static void easyMethod(String a) {
        int[] arr_i = new int[2];
        int lower = 0, upper = 0;

        for (int i=0; i<a.length(); i++){
            char c = a.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                upper++;
            } else if(c >= 'a' && c<= 'z') {
                lower++;
            }
        }

        for (int i = 0; i<arr_i.length; i++){
            arr_i[0] = lower;
            arr_i[1] = upper;
        }
        System.out.println(Arrays.toString(arr_i));
    }

    static void mediumMethod(String a) {
        int[] arr_i = new int[2];
        int c_lower=0, c_upper=0;

        for(int i=0; i<a.length()-1; i++){
            char c = a.charAt(i);
            char c1 = a.charAt(i+1);
            if(c >= 'a' && c <= 'z' && c1 >= 'a' && c1 <= 'z')
            {
                c_lower++;
            } else if (c >= 'A' && c <= 'Z' && c1 >= 'A' && c1 <= 'Z') 
            {
                c_upper++;
            }
        }          
        
        for (int i=0; i<arr_i.length; i++){
            arr_i[0] = c_lower;
            arr_i[1] = c_upper;
        }
        System.out.println(Arrays.toString(arr_i));
    }


    static void hardMethod(String s){
        char[] str = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            str[i] = s.charAt(i);
        }

        for (int i=0; i<str.length; i++) {
            if(str[i] >= 'a' && str[i] <='z'){
                System.out.println(str[i]);
            } 
        }

    }
}    
