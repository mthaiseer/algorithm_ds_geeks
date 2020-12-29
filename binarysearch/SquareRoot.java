package binarysearch;

public class SquareRoot {

    static int   sqrt(int  x){

        int  start =0;
        int  end = x;
        int   ans = 0;

        long square =0;


        while(start <= end){

            int  mid = (end+ start )/2;

            square = (long) mid * mid;

            if( square == (long)x){
                return mid;
            }
            if(square > x){
                end = mid -1;
            }else if( square < x){
                ans = mid;
                start = start +1;
            }

        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(sqrt(2147395599));
    }


}
