import java.util.Scanner;

class revstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String s = sc.nextLine();
        int n = s.length();
        for(int i = n-1; i >= 0 ;i--){
            System.out.print(s.charAt(i));
                   }
    }
}
