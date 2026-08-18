import java.util.Scanner;
class slnum {
    public static void main(String[] args) {
        int largest;
        int secondlargest;
        int [] arr = {10,20,30,40,50};

if(arr[0] > arr[1]) {
    largest = arr[0];
    secondlargest = arr[1];
}
else {
    largest = arr[1];
    secondlargest = arr[0];
}

for(int i = 2; i < arr.length; i++) {

    if(arr[i] > largest) {
        secondlargest = largest;
        largest = arr[i];
    }
    else if(arr[i] > secondlargest) {
        secondlargest = arr[i];
    }
}
System.out.println("The largest number is " + largest + " the second largest number is " + secondlargest);
    }
}
