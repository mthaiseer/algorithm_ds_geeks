package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBasketKSize {

    private static int maxFruits(char fruits[]){
        int maxSize = Integer.MIN_VALUE;
        int windowStart =0;
        int windowEnd =0;
        int K =2;
        Map<Character, Integer> characterMap = new HashMap<>();

        for(windowEnd =0; windowEnd < fruits.length; windowEnd++ ){
            char currentChar = fruits[windowEnd];
            characterMap.put(currentChar, characterMap.getOrDefault(currentChar, 0)+1);

            while(characterMap.size() > 2){
                char leftChar = fruits[windowStart];
                characterMap.put(leftChar, characterMap.get(leftChar)-1);
                windowStart++;

                if(characterMap.get(leftChar) == 0){
                    characterMap.remove(leftChar);
                }

            }

            maxSize =Math.max(maxSize, (windowEnd- windowStart)+1);
        }

        return maxSize;
    }

    public static void main(String[] args) {
        char fruits[] =  {'A', 'B', 'C', 'A', 'C'};
        int maxLength= maxFruits(fruits);
        System.out.println(maxLength);

        char fruits2[] = {'A', 'B', 'C', 'B', 'B', 'C'};
        maxLength = maxFruits(fruits2);
        System.out.println(maxLength);



    }
}
