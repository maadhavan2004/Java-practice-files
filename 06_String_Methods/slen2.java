import java.util.Scanner;

class slen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String s = sc.nextLine();
        System.out.println("The first letter is : " + s.charAt(0));
        System.out.println("The last letter is : " + s.charAt(s.length() - 1));
    }
}
