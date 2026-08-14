import java.util.Scanner;

class sepword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String s = sc.nextLine();
        int a = s.length();
        for(int i=0 ; i < a ; i++){
            System.out.println(s.charAt(i));
        }
    }
}
