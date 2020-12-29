package recursion;

public class RecursionWorks {

    static int tryRecursion(int n){
        if(n== 0){
            return 0;
        }
        int x = tryRecursion(n-1);
        System.out.println(x+n);
        return x+n;
    }

    public static void main(String[] args) {
        System.out.println(tryRecursion(3));
    }
}
