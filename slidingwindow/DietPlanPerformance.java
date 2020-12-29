package slidingwindow;

public class DietPlanPerformance {

    public static int dietPlanPerformance(int[] calories, int k, int lower, int upper) {

        int result =0;
        int windowend =0;
        int windowstart =0;
        int winddowsum  =0;

        for(windowend=0; windowend<calories.length; windowend++){

            winddowsum+= calories[windowend];

            if(windowend >= k-1){

                if(winddowsum < lower){
                    result+= -1;
                }

                if(winddowsum == upper){
                    result+= 0;
                }
                if(winddowsum > upper){
                    result+= 1;
                }

                winddowsum-= calories[windowstart];
                windowstart++;


            }

        }

        return result;

    }

    public static void main(String[] args) {
//        int calories[] = {1,2,3,4,5};
//        int k= 1;
//        int lower = 3;
//        int upper =3;

        //Input: calories = [3,2], k = 2, lower = 0, upper = 1
        int calories[] = {3, 2};
        int k= 2;
        int lower = 0;
        int upper = 1;



        int result  = dietPlanPerformance(calories, k, lower, upper);
        System.out.println(result);
    }

}
