import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {55,10,25,67,85,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertionSort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    public static int getMax(int[] arr, int start, int end){
        int max = start;
        for (int i = start+1; i <= end; i++) {

            if(arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    public static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr.length - i - 1;
            int max = getMax(arr, 0,last);
            swap(arr,max,last);
        }
    }

    public static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for(int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr,j,j-1);
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
}