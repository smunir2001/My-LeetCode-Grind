public class SLLNode {
    int val;
    SLLNode next;

    public SLLNode() {}

    public SLLNode(int val) {
        this.val = val;
    }

    public SLLNode(int val, SLLNode next) {
        this.val = val;
        this.next = next;
    }

    public void setData(int val) {
        this.val = val;
    }

    public int getData() {
        return this.val;
    }

    public void setNext(SLLNode next) {
        this.next = next;
    }

    public SLLNode getNext() {
        return this.next;
    }
}
