package treesQuestions;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class noOfNodes {
    public static int countOfNodes(Node root) {
        if (root == null)
            return 0;
        return 1 + countOfNodes(root.left) + countOfNodes(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(30);
        root.left.right = new Node(40);
        root.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        System.out.println("No. " + countOfNodes(root));

    }
}
