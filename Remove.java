package Indexing;

import java.util.Arrays;
import java.util.Scanner;

class indexing {

    public static int findIndex(int[] arr, int t){
        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 :index;
    }





    public static void main(String[] args) {
        int[] my_array = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you wish to find: ");
        int item = sc.nextInt();

        System.out.println("index position of 5: "+findIndex(my_array, item));
    }
}
