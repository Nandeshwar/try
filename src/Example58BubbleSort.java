public class Example58BubbleSort {
    public static void main(String[] args) {
        Example58BubbleSort e = new Example58BubbleSort();
        int[] arr = new int[]{10, 1, 2, 5, 7};
        e.bubbleSort(arr);
        for(int num : arr) {
            System.out.println(num);
        }

    }

    void bubbleSort(int[] arr) {
        for(int i = 0; i <arr.length; i++) {
            for(int j = 0; j < arr.length -i -1; j++) {
                if(arr[j] > arr[j+1]) {
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                }
            }
        }

    }
}
