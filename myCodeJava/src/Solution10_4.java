

// 分析可得f(n) - f(n-1) = f(n-1)
class Question10_4 {
    public int JumpFloorII(int target) {
        return (int) Math.pow(2, target - 1);
    }
}

public class Solution10_4 {

}
