package remove_member;

public class RemoveDuplicateMember {
    public static int removeDuplicate(int[] arr, int n) {
        // Return, if array is empty
        // or contains a single element
        if (n == 0 || n == 1) {
            return n;
        }

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[n - 1];

        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int[] array = {10, 10,20, 20, 50, 50,30, 30};

        int n = array.length;

        n = RemoveDuplicateMember.removeDuplicate(array, n);

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
