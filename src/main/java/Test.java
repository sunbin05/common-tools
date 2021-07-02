import list.DoubleLinedList;
import list.SinglyLinkedList;

public class Test {

    public static void main(String[] args) {

        DoubleLinedList list = new DoubleLinedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.toString());

        list.remove(3);
        System.out.println(list.toString());

    }

    public static void single(){
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("list.toString(): "+list.toString());
        System.out.println("list.size(): "+list.size());

        list.remove(2);
        System.out.println("list.toString(): "+list.toString());

        list.update(3, 33);
        System.out.println("list.toString(): "+list.toString());

        int a = list.get(5);
        System.out.println(a);
    }
}
