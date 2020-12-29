package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithSameLetttersAfterReplacement {

    private static int findLongestSubstring(String text, int K){
        int maxlength =0;
        Map<Character, Integer> characterMap = new HashMap<>();
        int windowEnd =0;
        int windowStart =0;
        int maxRepeatCharSize =0;

        for(windowEnd =0; windowEnd< text.length(); windowEnd++){

            //get individual character
            char currentchar = text.charAt(windowEnd);
            //store all frequency of individual letters
            characterMap.put(currentchar, characterMap.getOrDefault(currentchar, 0)+1);
            //find maximum repeated character in a given window
            maxRepeatCharSize = Math.max(maxRepeatCharSize, characterMap.get(currentchar));

            //maximum replaceable characters in given window
            // example ['A', 'A', 'B', 'B', 'A'] K= 2, so maxRepeatCharSize = 3(A)
            // 4 - 0+ 1 - 3 > 2 = 5 - 3 > 2 = NO which mean we can replace 2 characters in given window
            int repeatCharacterRange =  (windowEnd - windowStart)+ 1 - maxRepeatCharSize;

            //if we cannot replace values in given range then shrink window
            if(repeatCharacterRange > K){
                char leftChar = text.charAt(windowStart);
                characterMap.put(leftChar, characterMap.get(leftChar)-1);
                windowStart++;
            }
           maxlength = Math.max(maxlength, (windowEnd-windowStart)+1);
        }
        return maxlength;

    }

    public static void main(String[] args) {
        String text  = "bbccbbb";
        int K =2;
        //it should be 5, in window 5 we can replace 2 characters
        int windowSize =  findLongestSubstring(text, K);
        System.out.println(windowSize);

        text = "aba";
        K = 2;
        windowSize = findLongestSubstring(text, K);
        System.out.println(windowSize);

        //abbcb
        text = "abbcb";
        K = 1;
        windowSize = findLongestSubstring(text, K);
        //should return 4 bbcb => bbbbb
        System.out.println(windowSize);
    }
}
