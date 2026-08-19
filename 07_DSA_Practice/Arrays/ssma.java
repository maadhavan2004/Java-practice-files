class ssma {
    public static void main(String[] args) {
        int [] arr = {50, 20, 10, 40, 30};
        int smallest = arr[0];
        int secondsmallest = arr[1];
        if(arr[0] > arr[1]){
            secondsmallest = arr[0];
            smallest = arr[1];
        }

        else{
            secondsmallest = arr[1];
            smallest = arr[0];
        }
        int i = 0;
        for(i = 2; i < arr.length; i++){
            if(smallest>arr[i]){
                secondsmallest = smallest;
                smallest = arr[i];
            }

            else if(secondsmallest > arr[i]){
                secondsmallest = arr[i];
            }
        }

        System.out.println("The second smallest number in the array is: " + secondsmallest);
    }
}
