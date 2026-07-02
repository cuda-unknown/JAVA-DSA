package LinkedList;

public class fromScratch {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    Node Head = null;
    Node Tail;

    public void printLL() {
       
        if (Head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = Head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }


    }

    public void addFirst(){
       Node n4 = new Node(5);
       n4.next = Head;
       Head = n4;
    }

    public void addLast(){
        Node n5=new Node(40);
        Tail.next=n5;
        Tail=n5;
    }

    public void removeFirst(){
        Head=Head.next;
    }

    public void removeLast(){

        if(Head==null){
            return ;
        }

        if(Head.next==null){
            Head=null;
            return ;
        }
        Node temp=Head;

        while(temp.next.next!=null){
            temp=temp.next;
        }
        
        temp.next=null;
        
    }

    public static void main(String[] args) {
        fromScratch l=new fromScratch();
        Node n1 = l.new Node(10);
        Node n2 = l.new Node(20);
        Node n3 = l.new Node(30);

        n1.next = n2;
        n2.next = n3;
        l.Head = n1;

        l.Tail=n3;

        // l.printLL();

        l.addFirst();
        l.printLL();

        System.out.println();

        l.addLast();
        l.printLL();

        System.out.println();

        l.removeFirst();
        l.printLL();

        System.out.println();

        l.removeLast();
        l.printLL();
    }
}
