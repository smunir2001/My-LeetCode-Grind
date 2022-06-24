public class Main {
    public static void main(String[] args) {
        System.out.println("21. Merge Two Sorted Lists (solution1)");
        Solution1 slt1 = new Solution1();

        System.out.println("\nSLL1:");
        SinglyLinkedlist sLL1 = new SinglyLinkedlist();
        sLL1.insertAtTail(1);
        // sLL1.printSinglyLinkedlist();
        sLL1.insertAtTail(2);
        // sLL1.printSinglyLinkedlist();
        sLL1.insertAtTail(4);
        sLL1.printSinglyLinkedlist();
        // System.out.println("sLL1.head.getData() = " + sLL1.head.getData());

        System.out.println("\nSLL2:");
        SinglyLinkedlist sLL2 = new SinglyLinkedlist();
        sLL2.insertAtTail(1);
        // sLL2.printSinglyLinkedlist();
        sLL2.insertAtTail(3);
        // sLL2.printSinglyLinkedlist();
        sLL2.insertAtTail(4);
        sLL2.printSinglyLinkedlist();
        // System.out.println("sLL2.head.getData() = " + sLL2.head.getData());

        SinglyLinkedlist newSLL = new SinglyLinkedlist();
        newSLL.head = slt1.mergeTwoLists(sLL1.head, sLL2.head);
        newSLL.printSinglyLinkedlist();

    }
}
