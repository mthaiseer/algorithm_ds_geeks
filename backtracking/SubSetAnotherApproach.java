package backtracking;

public class SubSetAnotherApproach {

    static void generateSubSet(String text, String partial, int start) {
        if (start == text.length()) {
            System.out.println(partial);
            return;
        }

        generateSubSet(text, partial, start + 1);
        generateSubSet(text, partial + text.charAt(start), start + 1);

    }

    public static void main(String[] args) {
        String text = "abc";
        generateSubSet(text, "", 0);
    }

}
