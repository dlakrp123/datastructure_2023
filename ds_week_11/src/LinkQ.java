interface Queue3 {
	boolean isEmpty();

	void enqueue(Object x);

	Object dequeue();

	String peek();
}

class Node11 {
	Object data;
	Node11 link;

	public Node11(Object x) {
		data = x;
		link = null;
	}
}

class LinkQueue implements Queue3 {
	Node11 front, rear;
	int qSize;
	int pCount = 0;

	public LinkQueue() {
		front = rear = null;
		qSize = 0;
	}

	public boolean isEmpty() {
//		if(front == null) {return true;}
//		else {return false;}
		return (front == null);

	}

	public void enqueue(Object x) {
		Node11 newNode = new Node11(x);
		if (isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.link = newNode;
			rear = newNode;
		}
		qSize++;
	}

	public Object dequeue() {
		if (isEmpty()) {
			return -1;
		} else {
			Object tmpItem = front.data;
			front = front.link;
			qSize--;
			pCount++;
			return tmpItem;
		}
	}

	public String peek() {
		if (isEmpty()) {
			return null;
		}
		return front.data.toString();
	}

	public void delete() {
		if (!isEmpty()) {
			front = front.link;
			qSize--;
		}
	}

	public void printQueue() {
		Node11 currentNode = front;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.link;
		}
		System.out.println();
	}

	public int queueSize() {
		return qSize;
	}
}

public class LinkQ {
	public static void main(String[] args) {
		LinkQueue lq1 = new LinkQueue();

		System.out.println("원소 10개 삽입.");
		lq1.enqueue("Kim");
		lq1.enqueue("Lee");
		lq1.enqueue("Park");
		lq1.enqueue("Song");
		lq1.enqueue("Cho");
		lq1.enqueue(10);
		lq1.enqueue(20);
		lq1.enqueue(30);
		lq1.enqueue(40);
		lq1.enqueue(50);// 원소 10개 삽입

		System.out.println("원소의 갯수 : " + lq1.queueSize());

		System.out.println("----printQueue 사용----");
		lq1.printQueue();

		System.out.println("----원소 dequeue----");
		while (!lq1.isEmpty()) {
			System.out.println(lq1.dequeue());
		}
	}
}
