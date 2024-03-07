package Assignment_Course_1;

public class BinarySearchRecursive {
    // Recursive binary search function
    static int binarySearch(int[] arr, int left, int right, int target) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            // If the element is present at the middle itself
            if (arr[mid] == target)
                return mid;

            // If the element is smaller than mid, then it can only be present in the left subarray
            if (arr[mid] > target)
                return binarySearch(arr, left, mid - 1, target);

            // Else the element can only be present in the right subarray
            return binarySearch(arr, mid + 1, right, target);
        }

        // We reach here when the element is not present in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 2;
        int n = arr.length;
        int result = binarySearch(arr, 0, n - 1, target);
        if (result == -1)
            System.out.println("Element not present in array");
        else
            System.out.println("Element found at index " + result);
    }
}

