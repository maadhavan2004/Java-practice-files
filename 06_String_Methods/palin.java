import java.util.Scanner;

class palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String s = sc.nextLine();
        String a = "";
        int n = s.length();
        for(int i = n-1; i >= 0 ;i--){
            a = a + s.charAt(i);
                   }

        if(s.equals(a)){
            System.out.println("is palindrome");
        }

        else{
            System.out.println("is not a palindrome");
        }
    }
}
