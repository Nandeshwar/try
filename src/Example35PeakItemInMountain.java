public class Example35PeakItemInMountain {
    static int findPeakItemIndex(int[] list) {
        int left = 0;
        int right = list.length;

        while(left < right) {
            int mid = left + (right -left) / 2;
            if (list[mid] < list[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }
    public static void main(String[] args) {
        int[] list = new int[]{1, 2, 3, 2, 1};
        int peakItemIndex = findPeakItemIndex(list);
        System.out.println(peakItemIndex);
    }


}
