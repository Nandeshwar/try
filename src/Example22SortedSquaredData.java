import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Example22SortedSquaredData {
    public static void main(String[] args) {
        Integer[] list = new Integer[]{-1, -1, 3, 3};
        Integer[] newList = new Integer[list.length];

        int i = 0;
        int j = list.length - 1;
        int k = j;

        while(i <= j) {
            if(list[i] * list[i] > list[j] * list[j]) {
                newList[k] = list[i] * list[i];
                i++;
                k--;
            } else {
                newList[k] = list[j] * list[j];
                j--;
                k--;
            }
        }

        System.out.println("old list=%s".formatted(Arrays.deepToString(list)));
        System.out.println("new list=%s".formatted(Arrays.deepToString(newList)));
    }
}
