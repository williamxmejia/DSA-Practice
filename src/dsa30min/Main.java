package dsa30min;

public class Main {

    void selectionSort(int[] arr) {
        //    Time Complexity: The time complexity of Selection Sort is O(N2) as there are two nested loops:

        //    One loop to select an element of Array one by one = O(N)
        //    Another loop to compare that element with every other Array element = O(N)

        //    Therefore overall complexity = O(N) * O(N) = O(N*N) = O(N2)

        //    Auxiliary Space: O(1) as the only extra memory used is for temporary variables while swapping two values in Array.       The selection sort never makes more than O(N) swaps and can be useful when the memory write is a costly operation.

        int n = arr.length;

        for(int i = 0; i < n; i++) {
            int min_idx = i;

            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[min_idx])
                    min_idx = j;
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

    }

    void bubbleSort(int[] arr) {
        //Time Complexity: O(N2)
//        Auxiliary Space: O(1)
        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }

    }


    void printArray(int[] arr)
    {
        int n = arr.length;
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        Main ob = new Main();
        int[] arr = {64,25,12,22,11};
        int arr2[] = { 5, 1, 4, 2, 8 };
//        ob.selectionSort(arr);
//        System.out.println("Sorted array");
//        ob.printArray(arr);

        ob.bubbleSort(arr2);
        ob.printArray(arr2);



    }
}
