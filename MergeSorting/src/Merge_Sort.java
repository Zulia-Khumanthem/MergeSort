public class Merge_Sort {

    // Main method to sort the array using merge sort
    public static void sort(int[] array){
        if (array == null || array.length <= 1){
            return; // Already sorted
        }

        // Call the mergeSort method to star the sorting process
        mergeSort(array, 0, array.length - 1);
    }

    // Recursive method to divide the array and merge the sorted halves
    public static void mergeSort(int[] array, int left, int right){
        if (left < right) {
            // Find the middle point to divide the array into two halves
            int mid = left + (right - left) / 2;

            // Recursively sort the first and second halves
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    //  Merge method to combine two sorted halves into a single sorted array
    public static void merge(int[] array, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays to store the left and right halves
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);

        // Merge the two halves
        int i = 0, j = 0, k = left;

        while(i < n1 && j < n2){
            if (leftArray[i] <= rightArray[j]){
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        // Copy remaining elements from leftArray, if any
        while (i < n1){
            array[k++] = leftArray[i++];
        }

        // Copy remaining elements from rightArray, if any
        while (j < n2){
            array[k++] = rightArray[j++];
        }
    }


    public static void printArray(int[] array){
        for(int value : array){
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

