
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToMinHeap {
    // Function to maintain the min-heap property of the heap rooted at index 'i'
    public static void minHeapify(List<Integer> arr, int i, int n) {
        // Assume the root is the smallest element initially
        int smallest = i;
        // Calculate the indices of the left and right child of the current node
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        // Compare the left child with the current smallest
        if (l < n && arr.get(l) < arr.get(smallest))
            smallest = l;

        // Compare the right child with the current smallest
        if (r < n && arr.get(r) < arr.get(smallest))
            smallest = r;

        // If the current node is not the smallest, swap it with the smallest child
        if (smallest != i) {
            int temp = arr.get(i);
            arr.set(i, arr.get(smallest));
            arr.set(smallest, temp);
            // Recursively heapify the subtree rooted at the smallest child
            minHeapify(arr, smallest, n);
        }
    }

    public static void main(String[] args) {
        // Create a list representing the array
        List<Integer> arr = Arrays.asList(10, 5, 15, 2, 20, 30);

        System.out.print("Original array: ");
        // Print the original array
        for (int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");

        // Perform heapify operation on the min-heap
        // Start from the last non-leaf node and go up to the root of the tree
        for (int i = arr.size() / 2 - 1; i >= 0; i--)
            minHeapify(arr, i, arr.size());

        System.out.print("\nMin-Heap after heapify operation: ");
        // Print the min-heap after heapify operation
        for (int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");
    }
}
