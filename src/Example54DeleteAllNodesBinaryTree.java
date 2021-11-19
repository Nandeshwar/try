import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Example54DeleteAllNodesBinaryTree {
    public static void main(String[] args){
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node2 = new Node(2, node6, node7);
        Node node3 = new Node(3);
        Node root = new Node(1, node2, node3);

        deleteAllNodes(root);

        System.out.println("Delete all nodes using recursion");

    }

    static void deleteAllNodes(Node root) {
        Stack<Node> stack = new Stack();
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);


        while(queue.size() > 0) {
            int rowItemsCnt = queue.size();

            while(rowItemsCnt > 0) {
                Node node = queue.remove();
                rowItemsCnt--;
                stack.push(node);

                if(node.left != null) {
                    queue.add(node.left);
                }

                if(node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        while(stack.size() > 0) {
            Node node = stack.pop();
            System.out.println(node.item);
        }
    }

    static class Node {
        Node(){

        }
        Node(int item) {
            this.item = item;
        }
        Node(int item, Node left, Node right) {
            this.item = item;
            this.left = left;
            this.right = right;
        }


        int item;
        Node left;
        Node right;
    }

    static Node deleteAllNodesRecursion(Node root) {

        if(root == null) {
            return null;
        }

        if(root.left != null) {
            root.left = deleteAllNodesRecursion(root.left);
        }

        if(root.right != null) {
            root.right = deleteAllNodesRecursion(root.right);
        }

        if(root.left == null && root.right == null) {
            System.out.println(root.item);
            return null;
        }

        return root;
    }
}
