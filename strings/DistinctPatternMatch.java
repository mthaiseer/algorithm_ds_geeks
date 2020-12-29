package strings;

public class DistinctPatternMatch {

    static boolean search(String pat, String txt) {

        int patlength = pat.length();
        int txtlength = txt.length();
        int counter = 0;

        if(patlength > txtlength){
            return false;
        }
        //LOOP each character in from 0 to text.len - pat.len
        for (int i = 0; i <= txtlength - patlength; i++) {

            //LOOP each character in pat and text
            if (txt.charAt(i) == pat.charAt(0)) {

                for (int j = 0; j < patlength; j++) {
                    //IF any of of these characters not matching the break the LOOP
                    if (pat.charAt(j) != txt.charAt(i+j)) {
                        break;
                    }

                    //KEEP a counter to check all characters are matched
                    counter++;
                }

                //IF counter == pat.len then return false
                if(counter == patlength){
                    return true;
                }
                //IF some characters in txt match in pat, THEN slide OUTERLOOP = OUTERLOOP+ counter
                i = i+counter;
                //RESET COUNTER
                counter=0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        String txt= "abceabcdabceabcd";
//        String pat = "abcd";
        String txt= "abceabcdabceabcd";
        String pat = "gfhij";

        System.out.println(search(pat, txt));
    }
}
