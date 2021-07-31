package rmit;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String myString = new String("Coding is not cool");
        String myString2 = "Coding sucks";

        if(myString.equals(myString2)){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        System.out.println(myString.length());
        System.out.println(myString.charAt(3));
        System.out.println(myString.indexOf('a'));
        String[] arr_str = myString.split(" ");//meet the space, it split
        for(String str : arr_str){
            System.out.print(str+" ");
        }
        System.out.println();

        arr_str[2] = "not fucking";
        
        for(String str : arr_str){
            System.out.print(str+" ");
        }
        System.out.println();

        Pokemon poke1 = new Pokemon();
        Pokemon poke2 = new Pokemon();
        Pokemon poke3 = new Pokemon("Mew", 50);

        poke1.name = "Pikachu";
        poke1.level = 10;

        poke2.name = "Eevee";
        poke2.attack();

        poke3.attack();

        System.out.printf("%s %s\n",poke1.name,poke1.level);
        System.out.printf("%s %s\n",poke2.name,poke2.level);
        System.out.printf("%s %s\n",poke3.name,poke3.level);

        String sentence = "This is a duplicate!";
        System.out.println(sentence);

        checkDuplicate(sentence);

        age();

    }

    public static void checkDuplicate(String sentence) {
        String duplicates="";
        String characters="";
        for(int i=0; i<sentence.length(); i++){
            // each character will become a string(''=>"")
            String current_sentence = Character.toString(sentence.charAt(i));
            if(characters.contains(current_sentence)){
                if(!duplicates.contains(current_sentence)){
                    duplicates += current_sentence + ",";
                }
            }
            characters += current_sentence;
        }
        System.out.println(duplicates);
    }

    public static void age() {

        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(2000, 1, 26);
        int myAge = Period.between(birthDate, today).getYears();

        System.out.println(today);
        System.out.println(birthDate);
        System.out.println(myAge);

        System.out.println(findPrimes(1, 100));
    }

    public static ArrayList<Integer> findPrimes(int first_num, int last_num) {
        ArrayList<Integer> primesList = new ArrayList<Integer>();

        for(int n=first_num; n<=last_num; n++){
            //formula to check Prime
            boolean isPrime = true;
            int i=2; 
            while (i <= n/2){
                //if n % i is 0 => n can be multiplied by many 
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
                i++;
            }

            if(isPrime){
                primesList.add(n);
            }
        }

        return primesList;
    }
}

class Pokemon {
    //instance variables
    String name;
    int level;

    //Constructors
    Pokemon(){
        level = 1;
    }

    Pokemon(String name, int level){
        this.name = name;
        this.level = level;
        this.attack();
    }

    //methods
    void attack() {
        System.out.printf("%s attack!\n",name);
    }
}

