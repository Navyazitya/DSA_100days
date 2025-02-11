class invertioncount {
    public static int merge(int arr[], int left, int mid, int right) {
        int i = left, j = mid + 1, k = 0;
        int invCount = 0;
        int temp[] = new int[right - left + 1];

        // Merge two sorted halves and count inversions
        while ((i <= mid) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                invCount += (mid - i + 1); // Count inversions
                j++;
            }
            k++;
        }

        // Copy remaining elements of left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of right half
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy sorted elements back to original array
        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }

        return invCount;
    }

    private static int mergeSort(int arr[], int left, int right) {
        int invCount = 0;
        if (right > left) {
            int mid = left + (right - left) / 2;

            // Count inversions in left and right halves
            invCount += mergeSort(arr, left, mid);
            invCount += mergeSort(arr, mid + 1, right);

            // Merge and count cross-inversions
            invCount += merge(arr, left, mid, right);
        }
        return invCount;
    }

    public static int getInversions(int arr[]) {
        int n = arr.length;
        return mergeSort(arr, 0, n - 1);
    }

    public static void main(String args[]) {
        int arr[] = {1, 20, 6, 4, 5};
        System.out.println("Inversion Count = " + getInversions(arr));
    }
}
