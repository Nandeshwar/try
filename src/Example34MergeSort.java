public class Example34MergeSort {
    public static void main(String[] args) {
        int[] list = new int[]{20, 10, 3, 1, 2};
        Example34MergeSort m = new Example34MergeSort();

        for(int v:m.mergeSort(list)) {
            System.out.println(v);
        }
    }

    int[] mergeSort(int[] list) {
        int mid = list.length / 2;

        if(list.length == 1) {
            return list;
        }

        int[] list1 = new int[mid];
        int[] list2 = new int[list.length - mid];

        int i = 0;
        int j = 0;
        int k = 0;
        for(int v:list) {
            if(i < mid) {
                list1[j] = v;
                j++;
            } else {
                list2[k] = v;
                k++;
            }
            i++;
        }

        int[] l1 = mergeSort(list1);
        int[] l2 = mergeSort(list2);

        return merge(l1, l2);
    }

    int[] merge(int[] list1, int[] list2) {

        int[] newList = new int[list1.length + list2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < list1.length && j < list2.length) {
            if(list1[i] < list2[j]) {
                newList[k] = list1[i];
                i++;
            } else {
                newList[k] = list2[j];
                j++;
            }
            k++;
        }

        while(i < list1.length) {
            newList[k] = list1[i];
            i++;
            k++;
        }

        while(j < list2.length) {
            newList[k] = list2[j];
            j++;
            k++;
        }
        return newList;
    }
}
