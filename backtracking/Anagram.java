package backtracking;

public class Anagram {

    public static void generateAnagram(String text, boolean used[], StringBuffer buffer){

        if(buffer.length() == text.length()){
            System.out.println(buffer);
            return;
        }

        for(int i=0; i<text.length(); i++){

            if(!used[i]){
                used[i] = true;
                buffer.append(text.charAt(i));
                generateAnagram(text, used, buffer);
                used[i] = false;
                buffer.setLength(buffer.length()-1);

            }

        }

    }

    public static void main(String[] args) {
        String text = "god";
        boolean used[] = new boolean[text.length()];
        generateAnagram(text, used, new StringBuffer());
    }

}
