public class Example24Closest3Sum {
    public static void main(String[] args) {
        int[] list = new int[]{-1, 2, 1, -4};
        int target = 1;
        int expectedClosestTarget = 2;

        int closest = list[0] + list[1] + list[2];

        ME:
        for(int i=0; i < list.length -1; i++) {
            int j = i + 1;
            int k = list.length -1;

            while(j < k) {
                int sum = list[i] + list[j] + list[k];

                if(Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }
                if(sum == closest) {
                    break ME;
                } else if(sum < closest){
                    j++;
                } else {
                    k--;
                }
            }
        }

        System.out.println(closest);
        System.out.println(expectedClosestTarget == closest);
    }
}
