interface Queue<E>{
	boolean isEmpty();
	void enqueue(E x);
	E dequeue();
	E peek();
}

class myClass{
	int id;
	String name;
	public myClass() {
		
	}
	public myClass(int id1, String name1) {
		id = id1;
		name = name1;
	}
}

class ArrayQueue<E> implements Queue<E>{
	Object q[];
	int front, rear, qSize;
	
	public ArrayQueue() {
		q=new Object[10];
		front = 0;
		rear = 0;
		qSize = 0;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public void enqueue(Object x) {
		if((rear+1)%q.length==front) {
			resizeQ(q.length * 2);
		}
		rear =(rear+1)%q.length;
		q[rear] = x;
		qSize++;
	}
	
	public void resizeQ(int newSize) {
		Object[] tmpQ = new Object[newSize];
		for(int i = 1, j = front+1; i<qSize+1;i++,j++) {
			tmpQ[i] = q[j%q.length];
		}
		front = 0;
		rear = qSize;
		q=tmpQ;
	}
	
	public E dequeue() {
		Object tmpItem;
		if(isEmpty()) {
			return null;
		}
		front = (front+1) % q.length;
		tmpItem = q[front];
		q[front] = null;
		qSize--;
		return (E)tmpItem;
	}
	
	public E peek() {
		return (E)q[(front+1)%q.length];
	}
}

public class ArrayBasedQueue {

	public static void main(String[] args) {
		ArrayQueue q = new ArrayQueue();
		System.out.println(q.isEmpty());
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		System.out.println(q.isEmpty());
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		ArrayQueue<myClass> queue3 = new ArrayQueue();
		queue3.enqueue(new myClass(1,"Kim"));
		queue3.enqueue(new myClass(2,"Lee"));
		queue3.enqueue(new myClass(3,"Choi"));
		queue3.enqueue(new myClass(4,"Park"));
		queue3.enqueue(new myClass(5,"Yoo"));
		queue3.enqueue(new myClass(6,"Jeong"));
		queue3.enqueue(new myClass(7,"Yoon"));
		queue3.enqueue(new myClass(8,"Jang"));
		queue3.enqueue(new myClass(9,"Kang"));
		queue3.enqueue(new myClass(10,"Ahn"));
		
		myClass temp = new myClass();
		temp = queue3.peek();
		System.out.println(temp.id + " " + temp.name);
		
		while(!queue3.isEmpty()) {
			temp = queue3.dequeue();
			System.out.println(temp.id + " " + temp.name);
		}
		
		System.out.println("Queue3 = Empty? " + queue3.isEmpty());
		
	}

}