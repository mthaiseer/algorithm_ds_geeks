package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatSubString {

    private static int findNonRepeatSubString(String text){

        int maxlength = Integer.MIN_VALUE;
        int windowEnd =0;
        int windowStart =0;
        Map<Character, Integer> characterMap = new HashMap<>();

        //iterate each character in String
        for(windowEnd =0; windowEnd < text.length(); windowEnd++){

            //get current character
            char currentChar = text.charAt(windowEnd);

            //if character found again
            if(characterMap.containsKey(currentChar)){
                //move start pointer next to position of current character or current start which is maximum
                windowStart = Math.max(windowStart, characterMap.get(currentChar)+1);
            }
            //update character and current position
            characterMap.put(currentChar, windowEnd);
            //find current max length
            maxlength = Math.max(maxlength, (windowEnd-windowStart)+1);

        }
        return maxlength;

    }

    public static void main(String[] args) {
        String text = "aabccbb";
        int result = findNonRepeatSubString(text);
        System.out.println(result);
    }
}
