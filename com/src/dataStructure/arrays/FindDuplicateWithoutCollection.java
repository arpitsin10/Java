package dataStructure.arrays;

public class FindDuplicateWithoutCollection {
    public static void findAndPrintDuplicates(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n - 1; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count > 1) {
                System.out.println("Duplicate element: " + arr[i] + ", Count: " + count);
            }
        }
    }

    public static void main(String[] args) {
        int[] arrWithDuplicates = {1, 2, 3, 4, 5, 1, 1, 3};
        int[] arrWithoutDuplicates = {1, 2, 3, 4, 5};

        System.out.println("Array with duplicates:");
        findAndPrintDuplicates(arrWithDuplicates);

        System.out.println("\nArray without duplicates:");
        findAndPrintDuplicates(arrWithoutDuplicates);
    }
}

// todo