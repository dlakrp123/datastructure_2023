import java.util.Scanner;

class Node{
	String data;
	Node link;
	
	Node(String data){
		this.data = data;
		this.link = null;
	}
}

class LinkedList{
	Node head;
	Node tail;
	LinkedList() {
		this.head = null;
	}
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		tail.link = newNode;
		tail = newNode;
	}
	public void deleteFirst() {
		head = head.link;
		
	}
	public void printList() {
		Node tmpNode = head;
		while(tmpNode != null) {
			System.out.print(tmpNode.data + " ");
			tmpNode = tmpNode.link;
		}
	}
}

public class Solution {
    public static void main(String[] args) {
    	LinkedList list1 = new LinkedList();
    	LinkedList list2 = new LinkedList();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        String[] value1 = str1.split(" ");
        String[] value2 = str2.split(" ");
        
        for(int i = 0 ;i < value1.length ; i++) {
        	list1.addLast(value1[i]);
        }
        for(int i = 0 ;i < value2.length ; i++) {
        	list2.addLast(value2[i]);
        }
        
        System.out.print(list2.head.data + " ");
        list1.printList();
        System.out.println();
        list2.deleteFirst();
        list2.printList();
    }
}