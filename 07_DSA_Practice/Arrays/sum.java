import java.util.Scanner;
class sum {
    public static void main(String[] args) {
        int [] arr = {10, 20, 5, 15, 30};
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }

        System.out.println("The sum of the digits in the array is: " + sum);
        
}
}
