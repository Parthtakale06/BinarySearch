
public class BinarySearchReccursion {
    public static int BSReccursion(int arr[], int low, int high, int key) {

        while (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {

                return BSReccursion(arr, mid + 1, high, key);

            } else {

                return BSReccursion(arr, low, mid - 1, key);

            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int key = 8;
        int[] arr = { 1, 2, 3, 5, 6, 8, 9, 10 };
        int low = 0;
        int high = arr.length - 1;
      int ans =  BSReccursion(arr, low, high, key);
      System.out.println(ans);

    }

}
