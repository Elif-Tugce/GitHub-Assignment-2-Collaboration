import java.util.Random;

public class MethodsClass {

    //Option A
    public static int[] createArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }
    //Option C
    public static int minArray(int arr[]){
        int minValue = arr[0];

        for (int i=1; i < arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }

        return minValue;
    }


    public static int maxArray(int arr[]){
        int maxValue = arr[0];

        for (int i=1; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }

        return maxValue;
    }


    //Option D

    public static int averageOfArray(int arr[]){
        int sum = 0;
        int average;

        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        average = sum / arr.length;

        return average;
    }

    public static int[] differenceOfArray(int arr[], int average){

        int [] differ = new int [arr.length];

        for (int i = 0; i < arr.length; i++){
            differ [i] = arr[i] - average;
        }
        return differ;  
    }

    //Option E
    public static int oddsIndexsSum(int arr[]){
        int oddSum = 0;
        for (int i = 1; i < arr.length; i = i + 2) {
            oddSum = oddSum + arr[i];
        }
        return oddSum;
    }

    public static int evensIndexsSum(int arr[]){
        int evenSum = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            evenSum = evenSum + arr[i];
        }
        return evenSum;
    }


}
