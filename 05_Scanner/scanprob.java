import java.util.Scanner;

class scanprob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name : ");
        String a = sc.nextLine();
        System.out.println("The age is : " + n);
        System.out.println("The name is : " + a);
        
    }
}
