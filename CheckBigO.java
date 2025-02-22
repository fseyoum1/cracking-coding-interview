import java.util.HashMap;
import java.util.Map;

public class CheckBigO
{

    public static void main(String[] args)
    {
        System.out.println(sum(3));
        System.out.println(pairSumSequence(3));
        int[] arr = {1, 4, 8, 2, 22, 26, -1, 100, 80, 70};
        System.out.println("compute min and max in an array: " + computeMinOrMax(arr));
        System.out.println("compute min and max in an array: " + computeMinOrMax2(arr));
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


}
