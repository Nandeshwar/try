/*
input:
   n = 5 : only take 5 items
   v = 15 14 10 45 30
   w = 2   5 1   3 4
   bag weight = 7

   max weight of item will be same. choose weight which value is max

  understand the problem from this link: https://www.youtube.com/watch?v=bUSaenttI24

  and nice explanation of code using recursion: https://www.youtube.com/watch?v=kvyShbFVaY8

*/
public class Example53knapsack {
    public static void main(String[] args) {
        int[] w = new int[]{2, 5, 1, 3, 4};
        int[] v = new int[]{15, 14, 10, 45, 30};
        int bagWeight = 7;
        int n = 5;
        int expected=75;

        Example53knapsack e = new Example53knapsack();
        System.out.println(e.knapSackProblem(w, v, bagWeight, n));
    }

    int knapSackProblem(int[] w, int[] v, int bagWeight, int n) {
        if(n == 0 || bagWeight == 0) {
            return 0;
        }

        if(w[n-1] <= bagWeight) {
            int includedVal =v[n-1] + knapSackProblem(w, v, bagWeight - w[n-1], n-1);
            int notIncludedVal =knapSackProblem(w, v, bagWeight, n-1);
            return Math.max(includedVal, notIncludedVal);
        } else {
            return knapSackProblem(w, v, bagWeight, n-1);
        }
    }
}
