public class LinkedListExample {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL(99);
        list.display();
        System.out.println(list.get(0));
        list.insertFirst(78);
        list.insertLast(46);
        list.display();
        System.out.println(list.getSize());
        list.insert(34, 0);
        list.insert(26, 1);
        list.insert(5234, 8);
        list.insert(45, list.getSize()-1);
        list.display();
        list.remove();
        list.display();
        list.removeValue(99);
        list.display();
        list.removeIndex(0);
        list.display();
        list.removeIndex(1);
        list.display();
        System.out.println(list.get(0));
    }
}
