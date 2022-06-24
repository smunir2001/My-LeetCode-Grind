public class Solution1 {
    public SLLNode mergeTwoLists(SLLNode SLLlist1, SLLNode SLLlist2) {
        SLLNode tempNode = new SLLNode(0);
        SLLNode currentNode = tempNode;
        while (SLLlist1 != null && SLLlist2 != null) {
            if (SLLlist1.getData() <= SLLlist2.getData()) {
                currentNode.setNext(SLLlist1);
                SLLlist1 = SLLlist1.getNext();
            } else {
                currentNode.setNext(SLLlist2);
                SLLlist2 = SLLlist2.getNext();
            }
            currentNode = currentNode.getNext();
        }
        if (SLLlist1 != null) {
            currentNode.setNext(SLLlist1);
        }
        if (SLLlist2 != null) {
            currentNode.setNext(SLLlist2);
        }
        return tempNode.getNext();
    }
}
