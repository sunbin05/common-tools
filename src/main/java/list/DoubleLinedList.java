package list;

/**
 * 双向链表
 */
public class DoubleLinedList {

    private Node head;
    private Node tail;

    /**
     * 注意tail和head前后顺序
     */
    public DoubleLinedList(){
        tail = new Node();
        tail.setPre(head);
        tail.setNext(null);
        tail.setData(100);

        head = new Node();
        head.setData(0);
        head.setPre(null);
        head.setNext(tail);

    }

    /**
     * 新增节点为尾指针
     * @param data
     */
    public void add(int data){
        Node pre = tail;

        Node node = new Node();
        node.setData(data);
        node.setNext(null);
        node.setPre(pre);
        tail = node;
        tail.setPre(pre);

        pre.setNext(tail);
    }

    public void remove(int data){
        Node node = head;
        while(node != null){
            if(node.getData() == data){
                Node pre = node.getPre();
                Node next = node.getNext();
                if(pre == null){
                    node.setPre(null);
                    head = node;
                    return;
                }
                if(next == null){
                    pre.setNext(null);
                    tail = pre;
                    return;
                }
                pre.setNext(next);
                next.setPre(pre);
                return;
            }
            node = node.getNext();
        }
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        Node node = head;
        builder.append(node.getData()).append(",");
        Node next = node.getNext();
        while(next!=null){
            builder.append(next.getData()).append(",");
            next = next.getNext();
        }
        return builder.toString();
    }



    class Node{
        int data;
        Node pre;
        Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getPre() {
            return pre;
        }

        public void setPre(Node pre) {
            this.pre = pre;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
