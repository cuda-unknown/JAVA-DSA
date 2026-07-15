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

public class scratchLargestAndSmallest {
    public static int smallest(Node root,int s){
        if(root==null) return 0;
        if(root.data==s) return s;
        return smallest(root.left, s);
    }

    public static int largest(Node root,int l){
        if(root==null) return 0;
        if(root.data==l) return l;
        return largest(root.right, l);
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(20);
        root.left.left = new Node(15);
        root.left.right = new Node(30);
        root.right = new Node(60);
        root.right.left = new Node(55);
        root.right.right = new Node(70);

        System.out.println(smallest(root, 20));

        System.out.println(largest(root, 60));
        
    }
}
