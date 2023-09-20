import java.util.Random;
import java.util.Scanner;

public class MainApp{
    public static void main(String[] args) {
        int userChoice;
        int arrSize = 10;
        int random;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int average;

        System.out.println("Enter:");
        System.out.println("1 to find the max and min elements of the given array");
        System.out.println("2 to find the average of the elements in the given array");
        System.out.println("3 to find the sum of elements with odd- and even-numbered indexes in the given array");
        System.out.println("4 to EXIT");
        

        int [] arr = new int [arrSize];

        arr = MethodsClass.createArray(arrSize);

 
        do{

            userChoice = input.nextInt();
            if (userChoice == 1){
                System.out.printf("The min element of the given array is: %d\n", MethodsClass.minArray(arr) );
                System.out.printf("The max element of the given array is: %d\n", MethodsClass.maxArray(arr) );

            }
            else if(userChoice == 2){
                average = MethodsClass.averageOfArray(arr);
                System.out.printf("The average of the elements in the given array is: %d\n",average);
            }
        else if(userChoice == 3){
            System.out.println("The sum of the odd indexed numbers are: " + MethodsClass.oddsIndexsSum(arr));
            System.out.println("The sum of the even indexed numbers are: " + MethodsClass.evensIndexsSum(arr));
        }
            else if(userChoice == 4){
                System.out.println("EXIT. Have a nice day!");
            }
        } while(userChoice != 4);

    }
}
