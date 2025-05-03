public class Main {

    public static void main(String[] args) {
        int[] array = {45, 2, 87, 7, 34, 89, 10};

        System.out.println("Original Array:");
        Merge_Sort mg = new Merge_Sort();
        mg.printArray(array);

        mg.sort(array);

        System.out.println("Sorted Array:");
        mg.printArray(array);
    }
}