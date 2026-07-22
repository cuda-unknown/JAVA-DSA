package LinkedList;

public class Scratch {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node Head = null;
    Node Tail = null;

    public void print() {
        if (Head == null)
            System.out.println("List is empty");
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public boolean search(int key) {
        Node temp = Head;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println(temp.data + " ");
                return true;
            } else
                temp = temp.next;
        }
        return false;
    }

    public void size() {
        Node temp = Head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println(count);
    }

    public boolean cycle() {
        Node slow = Head;
        Node fast = Head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("Cycle detected");
                return true;
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        Scratch s = new Scratch();
        Node n1 = s.new Node(10);
        Node n2 = s.new Node(2);
        Node n3 = s.new Node(12);
        Node n4 = s.new Node(22);
        Node n5 = s.new Node(33);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next=n1; //for creating cycle
        s.Head = n1;
        s.Tail = n5;

        // System.out.print("Printing Elements in LinkedList : ");
        // s.print();

        // System.out.println();
        // System.out.print("Searching Element :");
        // System.out.print(s.search(2));

        // System.out.println();
        // System.out.print("Size of : ");
        // s.size();

        // cycle detection
        System.out.println();
        System.out.print("Detecting Cycle : ");
        System.out.print(s.cycle());
    }
}
