package strings;

public class CustomSubstring {

    static int strstr(String str, String target) {
        //m = str.length, n= target.length
        int stringlength = str.length();
        int patternlength = target.length();
        int counter =0;

        if(patternlength > stringlength){
            return -1;
        }
        //iterate characters in str from 0 to stringlength-patternlength
        for(int i=0 ; i<= stringlength - patternlength; i++) {
            //IF first characters of each string match
            if(str.charAt(i) == target.charAt(0)) {
                //LOOP target string
                for(int j=0;j<patternlength; j++) {
                    //IF any of characters not match then break
                    if(target.charAt(j) != str.charAt(i+j)){
                        break;
                    }
                    //keep a counter to find number of matching characters
                    counter++;

                }
                //if patternlength == counter then return i (outer loop)
                if(patternlength == counter){
                    return i;
                }else{
                    counter =0;
                }

            }
        }

        return -1;
    }

    public static void main(String[] args) {
//        String str = "GeeksForGeeks";
//        String target = "For";
//        System.out.println(strstr(str, target));
        String str = "abcabcabcd";
        String target = "abcd";
        System.out.println(strstr(str, target));
    }
}
