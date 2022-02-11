package Pre_Requisites;

public class NodeS<T> {
    T data;
    NodeS next;

    public NodeS(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public NodeS getNext() {
        return next;
    }
}
