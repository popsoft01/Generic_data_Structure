class ListNode<T> {
    T data;
    ListNode<T> nextNode;

    public ListNode(T object) {
        this(object, null);
    }

    public ListNode(T object, ListNode<T> node) {
        this.data = object;
        this.nextNode = node;
    }

    public T getData() {
        return data;
    }

    public ListNode<T> getNextNode() {
        return nextNode;
    }
}
