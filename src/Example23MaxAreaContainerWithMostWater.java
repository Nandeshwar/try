public class Example23MaxAreaContainerWithMostWater {
    public static void main(String[] args) {
        Integer[] input = new Integer[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        Integer output = 49;

        // use two pointers left and right
        // find width right - left
        // find height take two values(left and right) from array and take smaller one
        // find the area
        // check if this is max

        int i = 0;
        int j = input.length - 1;

        int max = 0;
        while(i < j) {
            int h;
            int w;

            if(input[i] < input[j]) {
                h = input[i];
                w = j -i;
                i++;
            } else {
                h = input[j];
                w = j -i;
                j--;
            }
            int area = w * h;
            max = Math.max(max, area);
        }

        System.out.println(max);
        System.out.println(output == max);

    }
}
