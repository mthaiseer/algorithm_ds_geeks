package strings;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String a,String b){


        char[] achars = a.toCharArray();
        char[] bchars = b.toCharArray();

        Arrays.sort(achars);
        Arrays.sort(bchars);

        String aString = new String(achars);
        String bString = new String(bchars);

       return aString.equals(bString);



    }

    public static void main(String[] args) {
        String a = "geeksforgeeks";
        String b = "forgeeksgeeks";
        System.out.println(isAnagram(a, b));

         a = "pwngmzajc";
         b = "ncgamzwjp";
        System.out.println(isAnagram(a, b));
    }
}
