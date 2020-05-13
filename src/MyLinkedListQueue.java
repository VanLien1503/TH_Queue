public class MyLinkedListQueue {
    // triển khai queue bằng linkedlist
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    // cài đặt phương thức trong MylinkedListQueue
// Kt is
    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

}
