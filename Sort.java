import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Sort {

    public static void main (String[] args){
        int[] arr = {2, 5, 3, 4, 1};
        System.out.println(Arrays.toString(arr));

//        int[] newArr = heapSort(arr);
//        System.out.println(Arrays.toString(newArr));

        inPlace(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort (int[] arr){
        if (arr.length == 1) return;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort (int[] arr){
        if (arr.length == 1) return;
        for (int i = 0; i < arr.length; i++){
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[i]){
                    minIndex = j;
                }
            }
            if (minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }


    public static void insertionSort (int[] arr){
        if (arr.length == 1) return;
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && temp < arr[j]){
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    private static int[] merge (int[] arr1, int[] arr2){
        int[] combined = new int[arr1.length + arr2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                combined[index] = arr1[i];
                index++;
                i++;
            } else if (arr1[i] > arr2[j]){
                combined[index] = arr2[j];
                index++;
                j++;
            } else {
                combined[index] = arr1[i];
                index++;
                i++;
            }
        }

        while (i < arr1.length){
            combined[index] = arr1[i];
            i++;
            index++;
        }
        while (j < arr2.length){
            combined[index] = arr2[j];
            j++;
            index++;
        }

        return combined;
    }

    public static int[] mergeSort (int[] arr){
        if (arr.length == 1) return arr;
        int med = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, med));
        int[] right = mergeSort(Arrays.copyOfRange(arr, med, arr.length));

        return merge(left, right);
    }

    private static void swap (int[] arr, int first, int second){
        if (arr.length == 1) return;
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int pivot (int[] arr, int pivotIndex, int endIndex){
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++){
            if (arr[i] < arr[pivotIndex]){
                swapIndex++;
                swap(arr, swapIndex, i);
            }
        }
        // we swap the items not the pointers!!!
        swap(arr, pivotIndex, swapIndex);
        return swapIndex;
    }

    private static void quickSortHelper (int[] arr, int left, int right){
        if (left < right){
            int pivotIndex = pivot(arr, left, right);
            quickSortHelper(arr, left, pivotIndex - 1);
            quickSortHelper(arr, pivotIndex + 1, right);
        }
    }

    public static void quickSort (int[] arr){
        quickSortHelper(arr, 0, arr.length -1);
    }

    public static int[] heapSort (int[] arr){
        int[] heapArr = new int[arr.length];
        Queue<Integer> pq = new PriorityQueue<>();

        for (int j : arr) {
            pq.offer(j);
        }

        for (int i = 0; !pq.isEmpty(); i++){
            heapArr[i] = pq.poll();
        }

        return heapArr;
    }

    public static void inPlace(int[] arr){
        Queue<Integer> pq = new PriorityQueue<>();

        for (int i : arr){
            pq.offer(i);
        }

        for (int i = 0; !pq.isEmpty(); i++){
            arr[i] = pq.poll();
        }
    }
}
