class Question12 {
    private final static int[][] next = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    private int rows;
    private int cols;

    private char[][] buildMatrix(char[] array) {
        char[][] matrix = new char[rows][cols];
        for (int r = 0, i = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++){
                matrix[r][c] = array[i++];
            }
        }
        return matrix;
    }


    private boolean backtracking(char[][] matrix, char[] str, boolean[][] marked, int pathLen, int r, int c) {
        if (pathLen == str.length) return true;
        if (r < 0 || r >= rows || c < 0 || c>=cols || matrix[r][c] != str[pathLen] || marked[r][c]) return false;
        marked[r][c] = true;
        for (int[] n : next)
            if (backtracking(matrix, str, marked, pathLen + 1, r + n[0], c + n[1]))
                return true;
        marked[r][c] = false;
        return false;
    }

    public boolean hasPath(char[] array, int rows, int cols, char[] str) {
        if (rows == 0 || cols == 0) return false;
        this.rows = rows;
        this.cols = cols;

        boolean[][] marked = new boolean[rows][cols];
        char[][] matrix = buildMatrix(array);

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (backtracking(matrix, str, marked, 0, i, j))
                    return true;
            }
        }
        return false;
    }
}
public class Solution12 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 't', 'g', 'c', 'f', 'c', 's', 'j', 'd', 'e', 'h'};
        char[] str = {'b', 'f', 'c', 'e'};
        Question12 q12 = new Question12();
        boolean res = q12.hasPath(array, 3, 4, str);
        System.out.println(res);
    }
}
