
class Question10_2 {
    public int RectCover(int target) {
        if (target <=2 ) {
            return target;
        } else {
            return RectCover(target - 1) + RectCover(target - 2);
        }
    }

    //  最优化版本
    public int RectCover2(int target) {
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

public class Solution10_2 {

}
