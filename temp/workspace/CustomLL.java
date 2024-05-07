package workspace;

import java.util.ArrayList;
import java.util.List;

public class CustomLL {
//    Create Custom LinkedList then reverse Nodes in it in groups of size K
//    Input: 1->2->3->4->5->6->7->8->NULL &  K=3
//    Output: 3->2->1 -> 6->5->4-> 8->7->NULL

    public static void main(String[] args) {
List<Node> linkList = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            Node n = new Node(i,null);

            if(linkList.get(i-1) != null){
                linkList.get(i-1).setNext(n);
            }
            linkList.add(n);

        }
        System.out.println(linkList);

    }

}

class Node {
    Integer value;

    Node next;

    public Node(Integer value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
