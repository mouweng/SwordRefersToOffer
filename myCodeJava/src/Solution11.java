import java.util.ArrayList;
class Question11 {
    // 普通做法
    public int minNumberInRotateArray(int [] array) {
        if (array.length<=0) {
            return 0;
        }
        int first  = 0, second;
        for (int i = 0; i < array.length; i++) {
            second = array[i];
            if (second >= first) {
                first = second;
            }else {
                return second;
            }
        }
        return array[0];
    }

    // 二分法
    public int minNumberInRotateArray2(int [] array) {
        if (array.length == 0)
            return  0;
        int l = 0, h = array.length - 1;
        while (l < h) {
            int m = (l + h) / 2;
            if (array[m] <= array[h]) {
                h = m;
            } else {
                l = m + 1;
            }
        }
        return array[l];
    }

}

public class Solution11 {
    public static void main(String[] args) {
        Question11 q11 = new Question11();
        int[] arr = {2, 3, 4, 1};
        int res = q11.minNumberInRotateArray2(arr);
        System.out.println(res);
    }
}
