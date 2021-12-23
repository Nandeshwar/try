import java.util.*;
public class Example59SubArrayBySum {
    public static void main(String[] args) {
        Example59SubArrayBySum o = new Example59SubArrayBySum();
        int[] a = new int[]{1, 2, 3, 4, 5};
        System.out.println(o.findSubArrayBySum(a, 9));

    }

    Index findSubArrayBySum(int a[], int sum) {
        Index index = new Index();
        Map<Integer, Integer> m = new HashMap<>();
        int currSum = 0;
        for(int i = 0; i < a.length; i++) {
            currSum += a[i];
            if(currSum == sum){
                index.begin = 0;
                index.end = i;
                return index;
            }

            if(m.containsKey(currSum - sum)) {
                index.begin = m.get(currSum - sum) + 1;
                index.end = i;
                return index;
            }

            m.put(currSum, i);
        }
        return index;
    }

}
class Index {
    int begin;
    int end;

    @Override
    public String toString() {
        return "Index{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
