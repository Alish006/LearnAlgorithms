package ArrayMinAndMaxValue;

import java.util.Scanner;

public class MinMaxArray {

    public static int minAndMaxArray(int[] arr, int ch){

        int n = arr.length;
        int temp = arr[0];

        switch (ch){
            case 0:
                System.out.print("Min value: ");
                for (int i = 1; i < n; i++){
                    if (temp > arr[i]){
                        temp = arr[i];
                    }
                }
                break;

            case 1:
                System.out.print("Max value: ");
                for (int i = 1; i < n; i++){
                    if (temp < arr[i]){
                        temp = arr[i];
                    }
                }
                break;

            default:
                System.out.print("Invalid input");
                System.exit(1);
        }

        return temp;
    }


    public static void main(String[] args){

        int[] arr = new int[]{19, 65, 67, 8, 10, 54};

        System.out.println("Find Min or Max value of your array:\n" +
                "Enter 0 for find Min value\n" +
                "Enter 1 for find Max value");

        System.out.print("Enter: ");

        Scanner scan = new Scanner(System.in);
        int ch = scan.nextInt();

        int res = minAndMaxArray(arr, ch);

        System.out.println(res);


    }
}
