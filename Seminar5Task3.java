//Задача 3. Реализовать алгоритм пирамидальной сортировки (HeapSort).

class Heapsort {
    public static void sorting(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            stack(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            stack(arr, i, 0);
        }
    }

    private static void stack(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            stack(arr, n, largest);
        }
    }
}

public class Seminar5Task3 {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3, 16, 4, 1, 13, 10, 7, 2, 11, 5 };
        printArray(arr);
        System.out.println("Массив отсортирован");
        Heapsort.sorting(arr);
        printArray(arr);
    }
}