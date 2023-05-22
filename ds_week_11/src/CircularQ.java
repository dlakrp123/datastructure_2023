interface Queue2 {
	boolean isEmpty();// 큐가 공백인가?

	void enqueue(Object x); // 원소 x를 삽입

	Object dequeue(); // 선두원소를 삭제하고 값 반환

	Object peek(); // 선두원소값을 반환
}

class arrayBasedQ implements Queue2{
	Object q[];
	int front, rear, qSize;

	public arrayBasedQ() {
		q = new Object[10];
		front = 0;
		rear = 0;
		qSize = 0;
	}

	public void delete() {//선두 원소 삭제
		if (isEmpty()) {
			System.out.println("Q is empty!");
		}
		front = (front + 1) % q.length;
		qSize--;
	}

	public Object peek() { // 선두 원소 반환
		return q[(front + 1) % q.length];
	}
	public int queueSize() {//큐크기 반환
		return qSize;
	}
	
	public void printQueue() {//큐 출력
		for(int i = front+1; i <= rear ; i++) {
			System.out.println(q[i]+" ");
		}
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
	
	public Object dequeue() {
		Object tmpItem;
		if(isEmpty()) {
			return null;
		}
		front = (front+1) % q.length;
		tmpItem = q[front];
		q[front] = null;
		qSize--;
		return tmpItem;
	}
	
	@Override
	public boolean isEmpty() {
		return front == rear;
	}

}

public class CircularQ {
	public static void main(String[] args) {
		arrayBasedQ aq1 = new arrayBasedQ();
		
		System.out.println("원소 10개 삽입.");
		aq1.enqueue("Kim");
		aq1.enqueue("Lee");
		aq1.enqueue("Park");
		aq1.enqueue("Song");
		aq1.enqueue("Cho");
		aq1.enqueue(10);
		aq1.enqueue(20);
		aq1.enqueue(30);
		aq1.enqueue(40);
		aq1.enqueue(50);//원소 10개 삽입
		
		System.out.println("원소의 갯수 : " + aq1.queueSize());
		
		System.out.println("----printQueue 사용----");
		aq1.printQueue();
		
		System.out.println("----원소 dequeue----");
		while(!aq1.isEmpty()) {
			System.out.println(aq1.dequeue());
		}
	}
}
