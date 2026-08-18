import java.util.Scanner;
class oec {
    public static void main(String[] args) {
        int [] arr = {10, 7, 22, 15, 8, 3, 14};
        int o = 0, e = o;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]%2 == 0){
                e++;
            }

            else{
                o++;
            }
        } 
        System.out.println("Odd count : " + o);
        System.out.println("Even count : " + e);
        
}
}
