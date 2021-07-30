import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Example32RightViewOfNode {

    public static void main(String[] args) {
        Node32 radhaKrishna = new Node32("RadhaKrishna");

        Node32 radha = new Node32("radha", new Node32("laxmi"), new Node32("vishnu"));
        Node32 krishna = new Node32("krishna");
        Node32 sita = new Node32("sita", radha, krishna);
        radhaKrishna.left = sita;
        radhaKrishna.right = new Node32("ram");

        System.out.println(radhaKrishna.rightView());
    }

}

class Node32 {
    String name;
    Node32 left;
    Node32 right;

    Node32(String name, Node32 left, Node32 right) {
        this.name = name;
        this.left = left;
        this.right = right;
    }

    Node32(String name) {
        this.name = name;
    }

    List<String> rightView() {
        Queue<Node32> queue = new LinkedList<>();
        List<String> rightViewList = new ArrayList<>();

        queue.add(this);
        int size = 1;

        while(size > 0) {

            while(size > 0) {
                Node32 node = queue.remove();
                size--;
                if(size == 0) {
                    rightViewList.add(node.name);
                }

                if(node.left != null) {
                    queue.add(node.left);
                }

                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            size = queue.size();
        }
        return rightViewList;
    }
}
