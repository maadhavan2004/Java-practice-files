import java.util.Scanner;

class charid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String s = sc.nextLine();
        System.out.println("Enter the charecter to count: ");
        char t = sc.next().charAt(0);
        int n = s.length();
        int c = 0;
        for(int i = 0; i<n ; i++){
            if(s.charAt(i) == t){
                c++;

            }

        }

        System.out.println("The number of time " + t + " Occured is " + c);
    }
}
