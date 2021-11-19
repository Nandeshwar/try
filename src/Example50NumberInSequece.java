/*
// https://www.geeksforgeeks.org/arrange-numbers-to-form-a-valid-sequence/


Given an array arr[] with N distinct numbers and another array arr1[] with N-1 operators (either < or >), the task is to organize the numbers to form a valid sequence which obeys relational operator rules with respect to provided operators.

Examples:

Input: arr[] = {3, 12, 7, 8, 5}; arr1= {‘<‘, ‘>’, ‘>’, ‘<‘}
Output: {3, 12, 8, 5, 7}
Explanation:
3 < 12 > 8 > 5 < 7
There can be more such combinations. The task is to return one of the combinations.

Input: arr[] = {8, 2, 7, 1, 5, 9}; arr1[] = {‘>’, ‘>’, ‘<‘, ‘>’, ‘<‘}
Output:{9, 8, 1, 7, 2, 5}
Explanation:
9 > 8 > 1 < 7 > 2 < 5
*/

import java.util.Arrays;

public class Example50NumberInSequece {
    public static void main(String[] args) {
        int[] expectedList = new int[]{5, 10, 30,  20,  11};
        int[] numList = new int[]{10, 30, 5, 20, 11};
        int[] newList = new int[numList.length];

        Arrays.sort(numList);
        String[] opList = new String[]{"<", "<", ">", ">"};

        int i = 0;
        int j = numList.length - 1;
        int k = 0;

        while(i <= j && k <= numList.length -2) {
            if(opList[k] == "<") {
                newList[k] = numList[i];
                i++;
            } else {
                newList[k] = numList[j];
                j--;
            }
            k++;
        }
        newList[numList.length - 1] = numList[i];

        System.out.println("new Array: " + Arrays.toString(newList));
    }
}
