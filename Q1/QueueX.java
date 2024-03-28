package Q1;

public class QueueX {
	private int queueArr[];
	private int maxSize;
	private int front;
	private int rear;
	private int noItems;
	public QueueX(int s) {
		
		this.maxSize = s;
		queueArr = new int[maxSize];
		
		this.front = 0;
		this.noItems = 0;
		this.rear = -1;
		
	}
	
	public boolean isEmpty() {
		return (noItems==0);
	}
	public boolean isFull() {
		return (rear == maxSize -1);  
	}
	public void insert(int j) {
		if(isFull()) {
			System.out.println("Queue is full");
		}else {
			queueArr[++rear] = j;
			noItems++;
		}
	}
	public int remove() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return 0;
		}
		else {
			noItems--;
			return queueArr[front++];
		}
	}
	
	
}
