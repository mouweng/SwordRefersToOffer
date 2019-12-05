class Question10_1 {
    // 递归求解
    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }

    // 动态规划
    public int Fibonacci2(int n) {
        if (n <=1 )
            return n;
        int[] fib = new int[n + 1];
        fib[1] = 1;
        for (int i = 2; i <= n; i++)
            fib[i] = fib[i-1] + fib[i-2];
        return fib[n];
    }

    // 动态规划复杂度降为O(1)
    public int Fibonacci3(int n) {
        if (n <=1 )
            return n;
        int pre2 = 0, pre1 = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = pre2 + pre1;
            pre2 = pre1;
            pre1 = fib;
        }
        return fib;
    }

}

public class Solution10_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Question10_1 q10_1 = new Question10_1();
            System.out.println(q10_1.Fibonacci3(i));
        }
    }
}
