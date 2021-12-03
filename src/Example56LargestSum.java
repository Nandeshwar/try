import java.util.*;
import java.util.stream.Collectors;

/*
Kadends algorithm
[-1, 2, 3 -7]

     take 1st number
        currSum = -1
        MaxSum = -1

        iterate:
           currSum >= 0
              currSum += a[i]
           else
             currSum = a[i]

          if currSum > maxSum
             maxSum = currSum
 */
public class Example56LargestSum {

    public static void main(String[] args) {
        Example56LargestSum o = new Example56LargestSum();
        LargestNumber lm = o.findLargestSumAndSequence(new int[]{-1, 2, 3, -8});
        System.out.println(lm.sum);
        System.out.println(lm.list);
    }

    LargestNumber findLargestSumAndSequence(int[] arr) {
        int currMax = arr[0];
        int max = arr[0];

        List<Integer> maxList = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();

        currList.add(arr[0]);
        for(int i = 0; i < arr.length; i++) {
            if(currMax >= 0 ) {
                currMax += arr[i];
                currList.add(arr[i]);

            } else {
                currMax = arr[i];
                currList = new ArrayList<>();
                currList.add(arr[i]);
            }

            if(currMax > max) {
                max = currMax;
                maxList = currList.stream().collect(Collectors.toList());
            }
        }

        LargestNumber largestNumber = new LargestNumber();
        largestNumber.sum = max;
        largestNumber.list = maxList;
        return largestNumber;
    }


}

class LargestNumber {
    int sum;
    List<Integer> list;
}
