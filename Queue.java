public class Queue<Type extends Comparable<Type>>{
    public Node head,tail;

    Queue(){
       head = tail = null;
    }

    public void enqueue(Type item){
        Node<Type> newNode = new Node<Type>(item);
        if(isEmpty()){
            head = tail = newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public Type dequeue(){
        if(head==null){
            return null;
        }
        else{
            Type item = (Type) head.item;
            head=head.next;
            return item;
        }
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        else{
            return false;
        }
    }

    public int size(){
        int count = 0;
        Node currentNode = head;
        while(currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    public void insertSort(Type item){
        Node<Type> newNode = new Node<Type>(item);
        if(isEmpty()){
            head = tail = newNode;
        }
        else{
            if(head.item.compareTo(item) > 0){
                newNode.next = head;
                head = newNode;
            }
            else{
                Node currentNode = head;
                while(currentNode.next != null){
                    if(currentNode.next.item.compareTo(item) > 0){
                        newNode.next = currentNode.next;
                        currentNode = newNode;
                        return;
                    }
                        currentNode=currentNode.next;
                }
            }
        }
    }
    public String toString(){
        String result = "";
        Node currentNode = head;
        while(currentNode!=null){
            result+=currentNode.item.toString();
            currentNode=currentNode.next;
        }
        return result;
    }
}
