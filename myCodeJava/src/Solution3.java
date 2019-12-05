class Question3 {
    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (numbers == null || length <= 0)
            return false;
        for (int i = 0; i < length; i++) {
            while (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                swap(numbers, i, numbers[i]);
            }
        }
        return false;
    }
}

public class Solution3 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 1, 0, 2, 5};
        int[] duplication = new int[3];
        Question3 q3 = new Question3();// 要引用非静态变量需要先做实例化

        boolean res = q3.duplicate(numbers, 6, duplication);
        System.out.println(res);
        System.out.println(duplication[0]);
    }
}
