
public class SearchI {
    public static void main(String args[]) {
        int[][] matrix = { { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 } };
        int target = 15;
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int m = matrix[i].length;
            // checking if the target is present within the range of i th row
            if (matrix[i][0] <= target && matrix[i][m - 1] >= target) {
                return binarySearch(matrix[i], target); // if yes then searching the i th row of matrix
            }
        }
        return false;

    }

    public static boolean binarySearch(int[] arr, int target) {
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        return false;
    }
}
