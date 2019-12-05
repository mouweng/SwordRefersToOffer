class Question10_3 {
    public int JumpFloor(int target) {
        if (target <=2 ) {
            return target;
        } else {
            return JumpFloor(target - 1) + JumpFloor(target - 2);
        }
    }

    //  最优化版本
    public int JumpFloor2(int target) {
        if (target <=2 ) {
            return target;
        }
        int pre2 = 1, pre1 = 2;
        int res = 0;
        for (int i = 3; i <= target; i++) {
            res = pre1 + pre2;
            pre2 = pre1;
            pre1 = res;
        }
        return res;
    }

}

public class Solution10_3 {

}
