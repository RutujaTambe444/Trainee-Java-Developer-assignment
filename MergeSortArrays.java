public class MergeSortArrays {
    public static void merge(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int end = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[end--] = X[i];
            }
        }

        // Merge X and Y
        int i = end + 1;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[k++] = X[i++];
            } else {
                X[k++] = Y[j++];
            }
        }

        while (j < n) {
            X[k++] = Y[j++];
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};

        merge(X, Y);

        // Print the merged array X
        for (int num : X) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
