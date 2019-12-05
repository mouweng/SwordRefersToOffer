class Question4 {
    public boolean Find(int target, int [][] array) {
        // 代码健壮性、鲁棒性
        if (array == null || array.length == 0 || array[0].length == 0)
            return false;
        int rows = array.length;
        int cols = array[0].length;
        int r = 0,c = cols-1; // 从右上角开始
        while (r < rows && c >= 0) {
            if (target == array[r][c])
                return true;
            else if (target > array[r][c])
                r++;
            else
                c--;
        }
        return false;
    }
}

public class Solution4 {
    public static void main(String[] args){
        int[][] array = {
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        Question4 q4 = new Question4();
        boolean res =  q4.Find(88, array);
        if (res == true)
            System.out.println("查找成功！");
        else
            System.out.println("未找到！");

    }
}
