public class ListsMerge {

    static class Node {
        int value;
        Node link;

        public Node(int value) {
            this.value = value;
            this.link = null;
        }
    }

    public static void main(String[] args) {
        Node list1 = new Node(10);
        list1.link = new Node(40);
        list1.link.link = new Node(100);
        list1.link.link.link = new Node(122);

        Node list2 = new Node(15);
        list2.link = new Node(30);
        list2.link.link = new Node(80);
        list2.link.link.link = new Node(150);
        list2.link.link.link.link = new Node(200);

        Node list3 = mergeTwoLists(list1, list2);
        
        Node p;
        for(p = list3 ; p != null ; p = p.link) {
        	System.out.print(p.value + " ");
        }
    }
    public static Node mergeTwoLists(Node l1, Node l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        Node result;
        
        if(l1.value <= l2.value) {
            result = l1;
            l1.link = mergeTwoLists(l1.link, l2);
        }
        else {
            result = l2;
            l2.link = mergeTwoLists(l1, l2.link);
        }
        return result;
    }
}