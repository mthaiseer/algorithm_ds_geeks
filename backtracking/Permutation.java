package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {

    static void permute(char characters[], boolean used[], List<Character> partials){

        if(partials.size() == characters.length){
            System.out.println(Arrays.toString(partials.toArray()));
            return;
        }

        for(int i=0; i<characters.length; i++){
            if(!used[i]){
                used[i] = true;
                partials.add(characters[i]);
                permute(characters, used, partials);
                used[i] = false;
                partials.remove(partials.size()-1);
            }
        }

    }

    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C'};
        boolean used[] = new boolean[arr.length];
        permute(arr, used, new ArrayList<>());
    }
}
