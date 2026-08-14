import java.util.Scanner;

class summethod {
    static int sum(int x, int y){
        return x + y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int b = sc.nextInt();
        int z = sum(a,b);
        System.out.println("The sum is: " + z);
    }
}
