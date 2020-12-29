package twopointer;

public class RemoveDuplicate {

    private static int removeDuplicate(int arr[]){
        int nonDuplicate = 1;
        int end =1;

        for(end =1;end <arr.length;end++ ){

            if(arr[nonDuplicate-1]  != arr[end]){
                arr[nonDuplicate] = arr[end];
                nonDuplicate++;
            }
        }

        return nonDuplicate;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3,3,6,7};
        int index  =  removeDuplicate(arr);
        for(int i=0; i<index; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
