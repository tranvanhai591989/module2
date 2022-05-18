package ss10_DSA_Danh_sach.Exercise.linkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedListEX<Integer> myLinkedList = new MyLinkedListEX<>();
        myLinkedList.addFirst(100);

        myLinkedList.addFirst(200);
        myLinkedList.addFirst(300);
        myLinkedList.addFirst(400);
        myLinkedList.addFirst(500);
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }

        myLinkedList.remove(2);
        System.out.println("------------");

        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }
        System.out.println("------------");

        System.out.println("First: " + myLinkedList.getFirst());
        System.out.println("Last: " + myLinkedList.getLast());
        System.out.println("------------");
        myLinkedList.clear();
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }
    }
}