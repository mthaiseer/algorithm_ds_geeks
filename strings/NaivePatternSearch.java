package strings;

public class NaivePatternSearch {
    static boolean search(String pat, String txt){

        int patternLength = pat.length();
        int textLength = txt.length();

        if(patternLength > textLength){
            return false;
        }
        int matchingConter =0;

        //iterate through each character in txt - pat
        for(int i= 0; i<=(textLength-patternLength); i++){
        //if first character of pat and txt matching
            if(txt.charAt(i) == pat.charAt(0)) {
                //THEN match individial characters between pat and txt
                for(int j=0; j<patternLength; j++) {
                    if(pat.charAt(j) != txt.charAt(i+j)) {
                        // IF any character is not matching then break
                        matchingConter =0;
                        break;
                    }

                    matchingConter++;
                    //IF all characters are matchiing j == length of pat, return TRUE
                }

                if(patternLength == matchingConter){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String S1 = "aabaacaadaabaaabaa";
        String S2 = "ccda";
        System.out.println(search(S2, S1));

    }

}
