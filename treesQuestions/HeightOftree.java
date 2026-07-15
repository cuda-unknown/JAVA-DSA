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

public class HeightOftree {
    public static int Height(Node root) {
        if (root == null)
            return -1;
        return 1 + Math.max(Height(root.left), Height(root.right));
    }

    public static boolean search(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;

        if (key < root.data)
            search(root.left, key);
        return search(root.right, key);

    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(30);
        root.left.right = new Node(40);
        root.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        System.out.println("Height of Tree : " + Height(root));
        System.out.println(search(root, 80));

    }
}
