package list;

/**
 * 单向链表
 */
public class SinglyLinkedList {

    private Node head;

    class Node {
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public void add(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        Node next = head.getNext();
        Node pre = head;
        while(next != null){
            next = next.getNext();
            pre = pre.getNext();
        }
        pre.setNext(node);
    }

    public void remove(int data){
        if(head == null){
            throw new NullPointerException("head is null");
        }
        Node node = head;
        Node pre = head;
        while(node != null){
            if(node.getData() == data){
                if(node == head){
                    head = node.getNext();
                }else{
                    node = node.getNext();
                    pre.setNext(node);
                }
                break;
            }
            pre = node;
            node = node.getNext();
        }
    }

    public void update(int a, int b){
        Node node = head;
        while(node.getData() != a){
            node = node.getNext();
        }
        node.setData(b);
    }

    public int get(int data){
        Node node = head;
        while(node.getData() != data){
            node = node.getNext();
        }
        return node.getData();
    }

    public int size(){
        if(head == null){
            return 0;
        }
        int count = 1;
        Node node = head.getNext();
        while (node != null){
            count ++;
            node = node.getNext();
        }
        return count;
    }

    public String toString(){
        StringBuilder buf = new StringBuilder();
        buf.append("[");
        if(head == null){
            buf.append("]");
            return buf.toString();
        }
        buf.append(head.getData()).append(",");
        Node next = head.getNext();
        while(next != null){
            buf.append(next.getData()).append(",");
            next = next.getNext();
        }
        String str = buf.substring(0,buf.length() - 1) + "]";
        return str;
    }

    public void reverse(){
        Node node = head;


    }

}
