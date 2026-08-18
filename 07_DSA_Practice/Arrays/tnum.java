import java.util.Scanner;
class tnum {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int target = 42;
        int i;
        boolean found = false;

        for(i=0 ; i< arr.length ; i++){
            if(arr[i] == target){
                found = true;
                break;
            }

        }
        if(found == true){
            System.out.println("The target is found ");
            System.out.println(arr[i] + " is at the index " + i);
        }

        else{
            System.out.println("The target is not found");
        }

        
    }
}
