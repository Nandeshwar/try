import java.util.*;
public class Example25MaxValueEveryRowBinaryTree {

    public static void main(String[] args) {

    /*
	input:
	   1
	3     2
	5     3  9
	output:
	   1, 3, 9
	*/

        Node25 r = new Node25(
                1,
                new Node25(3, new Node25(5, null, null), null),
                new Node25(2, new Node25(3, null, null), new Node25(9, null, null))
        );


        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(0, r.item);
        Example25MaxValueEveryRowBinaryTree e = new Example25MaxValueEveryRowBinaryTree();
        e.MaxValEachRow(r, m, 0);
        System.out.println(m);

        List<Integer> m2 = new ArrayList<>();
        m2.add(r.item);
        e.MaxValEachRow2(r, m2, 0);

        System.out.println(m2);
    }

    private void MaxValEachRow(Node25 node, HashMap<Integer, Integer> m, int level) {
        if(node == null ) {
            return;
        }

        if(m.get(level) == null ) {
            m.put(level, node.item);
        }
        m.put(level,(int)Math.max((double)m.get(level), (double)node.item));
        MaxValEachRow(node.left, m, level + 1);
        MaxValEachRow(node.right, m, level + 1);
    }

    private void MaxValEachRow2(Node25 node, List<Integer> m, int level) {
        if(node == null ) {
            return;
        }

        if(level > m.size() -1 ) {
            m.add(level, node.item);
        }
        m.set(level,(int)Math.max((double)m.get(level), (double)node.item));
        MaxValEachRow2(node.left, m, level + 1);
        MaxValEachRow2(node.right, m, level + 1);
    }
}

class Node25 {

    int item;
    Node25 left;
    Node25 right;

    Node25(int item, Node25 left, Node25 right){
        this.item = item;
        this.left = left;
        this.right = right;
    }
}

