public class Main {
    public static void main(String[] args) {
        int nums[] = {4, 6, 3, 1, 8, 2};
        int temp = 0;
        System.out.println("Before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[j + 1] < nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;


                }
            }
        }
        System.out.println();
        System.out.println("After sorting");
        for (int num : nums) {
            System.out.print(num + " ");

        }
    }
}
