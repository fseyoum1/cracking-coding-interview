import java.util.HashMap;
import java.util.Map;

public class CheckBigO
{

    public static void main(String[] args)
    {
        System.out.println(sum(3));
        System.out.println(pairSumSequence(3));
        int[] arrA = {1, 4, 8, 2, 22, 26, -1, 100, 80, 70};
        int [] arrB = {3, 2, 6, 1, 7, 8, 10};
        System.out.println("compute min and max in an array: " + computeMinOrMax(arrA));
        System.out.println("compute min and max in an array: " + computeMinOrMax2(arrA));
    }

    /**
     * Calls like this, recursive calls takes space and this will require
     * O(N) space. Each call is added to the call stack.
     * @param n
     * @return
     */
    public static int sum(int n)
    {
        if (n <= 0)
        {
            return 0;
        }
        int y = n + sum(n-1);
        return y;
    }

    /**
     * Just because you have n calls total does not mean it takes O(N) spaces.
     * The pairSum does make roughly n call, but those calls do not exist on the call stack simultaneously,
     * so you need O(1) space.
     * @param n
     * @return
     */
    public static int pairSumSequence(int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            //sum += pairSum(i, i + 1);
            sum = sum + pairSum(i, i + 1);
        }
        return sum;
    }

    private static int pairSum(int a, int b) {
        return a + b;
    }

    // Drop constants

    /**
     * Big is O(N)
     * @param arr
     * @return
     */
    public static Map computeMinOrMax(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Map<String, Integer> minMaxMap = new HashMap<>();
        for (int x : arr)
        {
            if (x < min) min = x;
            if (x > max) max =  x;
        }
        minMaxMap.put("Minimum", min);
        minMaxMap.put("Maximum", max);
        return minMaxMap;
    }

    /**
     * Someone might assume the big(O) for this is O(2N).
     * But we should drop the constant and its big(O) is O(N)
     * @param arr
     * @return
     */
    public static Map computeMinOrMax2(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Map<String, Integer> minMaxMap = new HashMap<>();
        for (int x : arr)
        {
            if (x < min) min = x;
        }
        for (int x : arr)
        {
            if (x > max) max =  x;
        }
        minMaxMap.put("Minimum", min);
        minMaxMap.put("Maximum", max);
        return minMaxMap;
    }

    // Multi-part algorithm add vs multiply

    /**
     * suppose you have an arrA and arrB, then print the content in each of them
     * we do A chunks of work for arrA and B chunks of work for arrB.
     * Total amount of work is O(A+B)
     */
    public static void printElement(Integer[] arrA, Integer[] arrB)
    {
        for (int a : arrA)
        {
            System.out.println(a);
        }
        for (int b : arrB)
        {
            System.out.println(b);
        }
    }

    /**
     *  we do B chunks of work for each element in A.
     *  Therefore the total amount of work is O(A*B)
     */
    public void printElement2(Integer[] arrA, Integer[] arrB)
    {
        for (int a : arrA)
        {
            for (int b : arrB)
            {
                System.out.println(a + " " + b);
            }
        }
    }

    /* Amortized time
    An array list dynamically resizes when the array is full or may be 75%, this causes some of the insertion
    to take O(n). However, we also know that this doesn't happen very often. The vast majority of the time
    insertioin will take O(1) time. We need a concept that takes both into account. This is what Amortized
    time does. This worest case happens every once in a while. But once it happens, it won't happen again for so
    long that the cost is "Amortized". The amortized time for each insertion is O(1).
    */

    // Log N Runtimes
    /*
    We start off with an N element arry to search, then after a single step we are down to N/2, N/4, N/8 etc.
    when you see aproblem where the number of elements in the problem space gets halved each time, that will likely
    be O(log N) runtime. This is the same reason why finding an element in a balnaced binary search tree is O(log N).
    With each comparison we go either left of right.
    */

    public int f(int n)
    {
        if (n <= 1)
        {
            return 1;
        }
        return f(n -1) + f(n-1);
    }
}
