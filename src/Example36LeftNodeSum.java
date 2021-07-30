import java.util.LinkedList;
import java.util.Queue;

public class Example36LeftNodeSum {
    public static void main(String[] args) {
         /*
	  10
	7   20
      15 30

*/

        Node root = new Node(
                10,
                new Node(7),
                new Node(20, new Node(15), new Node(30)
                ));

        System.out.println(root.sumLeftNodes());
    }

}

class Node {
    private int item;
    private Node left;
    private Node right;

    Node(int item, Node left, Node right) {
        this.item = item;
        this.left = left;
        this.right = right;
    }

    Node(int item) {
        this.item = item;
    }

    int sumLeftNodes() {
        int sum = 0;
        Queue q = new LinkedList();
        q.add(this);

        while(!q.isEmpty()){
            int rowLen = q.size();

            while(rowLen != 0) {
                rowLen--;
                Node node = (Node)q.remove();


                if(node.right != null) {
                    q.add(node.right);
                }

                if(node.left != null) {
                    q.add(node.left);
                }

                if(rowLen == 0) {
                    sum += node.item;
                }
            }
        }

        return sum;
    }
}
