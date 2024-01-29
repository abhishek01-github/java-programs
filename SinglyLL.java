public class SinglyLL {
    private Node Head;
    private Node Tail;
    private int size;

    private class Node{
        int value;
        Node next;
    }

    SinglyLL(){
        this.Head = null;
        this.Tail = null;
    }

    SinglyLL(int value){
        Node node = new Node();
        node.value = value;
        node.next = null;
        this.Head = node;
        this.Tail = node;
        size++;
    }

    public void insertLast(int value){
        Node node = new Node();
        node.value = value;
        if(this.Head==null){
            this.Head = node;
            this.Tail = node;
            size++;
            return;
        }
        Tail.next = node;
        node.next = null;
        size++;
    }

    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index>size){
            System.out.println("NO such index present");
            return;
        }
        Node temp = Head;
        for (int i = 1; i < size; i++) {
            if(i==index)
            break;
            else
            temp = temp.next;
        }
        Node node = new Node();
        node.next = temp.next;
        temp.next = node;
        node.value = value;
        if(this.Tail == temp)
        this.Tail = node;
        size++;
    }
    
    public void insertFirst(int value){
        Node node = new Node();
        if(this.Head == null){
            this.Head = node;
            this.Tail = node;
            size++;
            return;
        }
        node.next = this.Head;
        node.value = value;
        this.Head = node;
        size++;
    }

    public int removeValue(int value){
        Node temp = Head;
        if(temp.value == value){
        Head = temp.next;
        temp.next = null;
        size--;
        return value;
        }
        while (temp.next != null) {
            if(temp.next.value == value){
                Node s = temp.next;
                temp.next = s.next;
                s.next = null;
                size--;
                return value;
            } else {
                temp = temp.next;
            }
        }
        return -1;
    }

    public int getSize(){
        return this.size;
    }

    public int get(int index){
        Node temp = Head;
        for (int i = 0; i < size; i++) {
            if(i==index)
            return temp.value;
            temp = temp.next;
        }
        return -1;
    }

    public void display(){
        Node temp = Head;
        while(temp.next != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.value);
    }

    public void remove(){
        removeIndex(size-1);
    }

    public void removeIndex(int index){
        Node temp = Head;
        for (int i = 0; i < size; i++) {
            if(i==index){
                removeValue(temp.value);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Index not present");
    }
}
