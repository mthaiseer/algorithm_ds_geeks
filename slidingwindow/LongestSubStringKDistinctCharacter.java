package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringKDistinctCharacter {

    private static int findLengthOflongestSubString(String text, int K) {
        int result = Integer.MIN_VALUE;
        int windowStart = 0;
        int windowEnd = 0;
        Map<Character, Integer> characterMap = new HashMap<>();

        for (windowEnd = 0; windowEnd < text.length(); windowEnd++) {

            Character currentChar = text.charAt(windowEnd);
            characterMap.put(currentChar, characterMap.getOrDefault(currentChar, 0) + 1);

            while(characterMap.size() > K){
                char leftChar = text.charAt(windowStart);
                characterMap.put(leftChar, characterMap.get(leftChar)-1);
                windowStart++;

                if(characterMap.get(leftChar) == 0){
                    characterMap.remove(leftChar);
                }
            }


            result = Math.max(result, (windowEnd - windowStart)+1);
        }

        return result;
    }

    /**
     * This problem says to get distict character from a String
     * If string is abaac and K =2 then abaa contains 2 distict character and if we add c the character count increases to 3
     * So the maximum length we can get from above string is abaa
     * @param args
     */
    public static void main(String[] args) {
        String  text = "araaci";
        int K =2;
        int length = findLengthOflongestSubString(text, K);
        System.out.println(length);

        text = "araaci";
        K =1;
        length = findLengthOflongestSubString(text, K);
        System.out.println(length);

        text = "cbbebi";
        K =3;
        length = findLengthOflongestSubString(text, K);
        System.out.println(length);
    }
}