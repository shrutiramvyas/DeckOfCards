public class Node<Type extends Comparable<Type>> {
    public Type item;
    public Node next;

    Node(Type item){
        this.item = item;
        this.next = null;
    }

}
