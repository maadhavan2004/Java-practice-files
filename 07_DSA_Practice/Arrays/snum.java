class snum {
    public static void main(String[] args) {
        int[] arr = {10,20,30,50,40};
        int smallest = arr[0];

        for(int i=0 ; i < arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }

        System.out.println(" The Smallest number is " + smallest);
    }
}
