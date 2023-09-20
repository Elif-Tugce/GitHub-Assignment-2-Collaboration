import java.util.Random;

public class MethodsClass {
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
        int minValue = arr[0];

        for (int i=1; i < arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }

        return minValue;
    }


    public int maxArray(int arr[]){
        int maxValue = arr[0];

        for (int i=1; i < arr.length; i++){
            if(arr[i] < maxValue){
                maxValue = arr[i];
            }
        }

        return maxValue;
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


        return 1;
    }

    public int evensIndexsSum(int arr[]){


        return 1;
    }


}
