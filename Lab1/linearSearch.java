
public class linearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 20, 7, 15};
        int target = 12;

        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println(
                "Tim thay so " + target + " tai vi tri " + result
            );
        } else {
            System.out.println("Khong tim thay");
        }
    }
}
