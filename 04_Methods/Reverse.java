class reversenum {
    static int reverse(int x){
        int n = 0 , result= 0 ;
        while(x > 0){
            n = x % 10;
            x = x / 10;
            result *=10;
            result += n; 
        }
        return result;


    }
    public static void main(String[] args) {
        int z = 0;
        z = reverse(1234);
        System.out.println(z);

    }
}
