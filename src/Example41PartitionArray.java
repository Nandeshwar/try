import java.util.HashMap;

public class Example41PartitionArray {
    public static void main(String[] args) {

        Example41PartitionArray e = new Example41PartitionArray();
        int[] list = new int[]{10, 20, 1,5, 3, 10};
        int result = 25;

        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        boolean exist = e.findSum(list, 0, 0, result, map);
        System.out.println(exist);
    }

    boolean findSum(int[] list, int index, int sum, int result, HashMap<String, Boolean> map) {
        String state = index + "" + sum;
        if(sum == result) {
            return true;
        }

        if (index >= list.length) {
             return false;
        }

        boolean r = findSum(list, index+1, sum, result, map) || findSum(list, index + 1, sum + list[index], result, map);
        map.put(state, r);
        return r;
    }
}
