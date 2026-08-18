import java.util.Scanner;
class rnum {
    public static void main(String[] args) {
        int [] arr = {10,4,15,22,22,34,22,34};
        int target = 22;
        int i ;
        int c=0;
        for(i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                c++;
            }
        }

        System.out.println(target + " is printed " + c + " times");
    }
}
