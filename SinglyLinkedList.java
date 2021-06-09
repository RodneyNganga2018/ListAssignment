public class SinglyLinkedList {
    private Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        if (head != null) {
            Node runner = head;
            while(runner.next != null) {
                Node test = runner.next;
                if (test.next == null) {
                    runner.next = null;
                } else {
                    runner = runner.next;
                }
            }
            
        }
    }

    public void printValues() {
        if (head != null) {
            Node runner = head;
            while(runner.next != null) {
                System.out.println(runner.value);
                runner = runner.next;
            }
            System.out.println(runner.value);
        }
    }

    public Node find(int num) {
        Node none = new Node(-1);
        if (head != null) {
            Node runner = head;
            while(runner.next != null) {
                if (runner.value == num) {
                    return runner;
                } else {
                    runner = runner.next;
                }
            }
            if (runner.value == num) {
                return runner;
            }
            return none;
        } else {
            return none;
        }
    }
}
