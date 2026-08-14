import java.util.Scanner;

class twoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int b = sc.nextInt();
        System.out.println("The Sum is : " + (a+b));
        System.out.println("The difference is : " + (a-b));
        System.out.println("The product is : " + (a*b));
    }
}
