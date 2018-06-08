public class ShellSort {
    public static void main(String[] args) {
        int[] nums = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        showArray(nums);

        for (int gap = (nums.length / 2); gap > 0; gap /= 2) {
            for (int i = gap; i < nums.length; i++) {
                int newValue = nums[i];

                int j = i;

                while (j >= gap && nums[j - gap] > newValue) {
                    nums[j] = nums[j - gap];
                    j -= gap;
                }

                nums[j] = newValue;
            }
        }

        showArray(nums);
    }

    private static void showArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }
}