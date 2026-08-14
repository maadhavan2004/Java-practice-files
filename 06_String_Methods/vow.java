import java.util.Scanner;

class vow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;

        System.out.println("Enter your name : ");
        String s = sc.nextLine();
        int a = s.length();
        for(int i = 0; i < a ; i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I'|| s.charAt(i)=='O'|| s.charAt(i)=='U'){
                c++;
            }


        }

        System.out.println("The number of vowels " + c);
    }
}
