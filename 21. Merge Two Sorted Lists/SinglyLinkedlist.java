public class SinglyLinkedlist {
    SLLNode head = null;
    
    public SinglyLinkedlist() {
        // System.out.println("Initializing new SLL object.");
    }

    public void insertAtHead(int data) {
        // System.out.println("\nSUCCESS: insertingAtHead(" + data + ") in SLL.");
        if (head == null) {
            head = new SLLNode(data, null);
        } else {
            SLLNode newHead = new SLLNode(data, head);
            head = newHead;
        }
    }

    public void removeFromHead() {
        if (head == null) {
            // System.out.println("\nERROR: cannot removeFromHead() from empty SLL.");
        } else {
            // System.out.println("\nSUCCESS: removingFromHead(" + head.getData() + ") from SLL.");
            head = head.getNext();
        }
    }

    public void insertAtTail(int data) {
        // System.out.println("\nSUCCESS: insertingAtTail(" + data + ") in SLL.");
        if (head == null) {
            head = new SLLNode(data, null);
        } else {
            SLLNode currentNode = head;
            while (currentNode != null && currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            SLLNode newNode = new SLLNode(data, null);
            currentNode.setNext(newNode);
        }
    }

    public void removeFromTail() {
        if (head == null) {
            // System.out.println("\nERROR: cannot removeFromTail() from empty SLL.");
        } else if (head != null && head.getNext() == null) {
            // System.out.println("\nSUCCESS: removingFromTail(" + head.getData() + ") from SLL.");
            head = null;
        } else {
            SLLNode currentNode = head;
            while (currentNode != null && currentNode.getNext().getNext() != null) {
                currentNode = currentNode.getNext();
            }
            // System.out.println("\nSUCCESS: removingFromTail(" + currentNode.getNext().getData() + ") from SLL.");
            currentNode.setNext(null);
        }
    }

    public void printSinglyLinkedlist() {
        if (head == null) {
            System.out.println("SLL: HEAD -> NULL");
        } else {
            System.out.print("SLL: HEAD -> ");
            SLLNode currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.getData() + " -> ");
                currentNode = currentNode.getNext();
            }
            System.out.println("NULL");
        }
    }
}
