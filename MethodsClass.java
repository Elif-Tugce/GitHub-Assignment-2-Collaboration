import java.util.Random;

public class MethodsClass {

    //Madde A
    public static int[] createArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }
    //Madde C
    public int minArray(int arr[]){




        return 1;
    }


    public int maxArray(int arr[]){




        return 1;
    }


    //Madde D

    public int averageOfArray(int arr[]){


        return 1;
    }

    public int[] differenceOfArray(int arr[], int average){


        return /*array döncek*/;  
    }

    //Madde E
    public int oddsIndexsSum(int arr[]){
        int oddSum = 0;
        for (int i = 1; i < arr.length; i = i + 2) {
            oddSum = oddSum + arr[i];
        }
        return oddSum;
    }

    public int evensIndexsSum(int arr[]){
        int evenSum = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            evenSum = evenSum + arr[i];
        }
        return evenSum;
    }


}
