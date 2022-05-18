package ss10_DSA_Danh_sach.practice.linked_list_class;

public class TestMyLinkedList {
    public static <E> void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList<E> ll = new MyLinkedList<E>(10);
        ll.addFirst(16);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(1,78);
        ll.add(4,8);
        ll.printList();
    }
}