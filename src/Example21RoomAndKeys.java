// https://www.youtube.com/watch?v=Rz_-Kx0LN-E&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=28
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Example21RoomAndKeys {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        List<List<Integer>> roomAndKeys = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3),
                Arrays.asList()
        );

        System.out.println(roomAndKeys);

        List<Integer> visited = new ArrayList<>();

        visited.add(0);
        stack.push(0);

        while(!stack.empty()) {
            int k = stack.pop();
            for(int key : roomAndKeys.get(k)){
                if(!visited.contains(key)){
                    visited.add(key);
                    stack.push(key);
                }
            }
        }

        if(roomAndKeys.size() == visited.size()) {
            System.out.println("All rooms are visited");
        } else {
            System.out.println("All rooms are not visited");
        }
    }
}
