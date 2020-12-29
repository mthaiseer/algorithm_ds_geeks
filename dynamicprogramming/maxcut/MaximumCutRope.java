package dynamicprogramming.maxcut;

public class MaximumCutRope {

    static int maxcut(int n, int a, int b, int c){
        if(n <0 ){
            return -1;
        }

        if(n ==0){
            return 0;
        }

        int result  = Math.max(maxcut(n-a, a,b,c), Math.max(maxcut(n-b, a,b,c), maxcut(n-c, a,b,c)));
        if(result == -1){
            return -1;
        }

        return result+1;
    }

    public static void main(String[] args) {
       //int max =  maxcut(5, 1,2,3);
        int max =  maxcut(23, 12,11,13);
        System.out.println(max);
    }
}
