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




        return 1;
    }


    public int maxArray(int arr[]){




        return 1;
    }


    //Madde D

    public int averageOfArray(int arr[]){
        int sum = 0;
        int average;

        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        average = sum / arr.length;

        return average;
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
