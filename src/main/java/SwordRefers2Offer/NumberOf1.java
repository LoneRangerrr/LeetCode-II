package SwordRefers2Offer;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class NumberOf1 {
    public int NumberOf1(int n) {
        int res = 0;
        if (n == 0) return res;
        while (n != 0) {
            n &= n - 1;
            res++;
        }
        return res;
    }
}
