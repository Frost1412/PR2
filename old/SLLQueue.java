package PR2.old;

class SLLQueue {
    private QueueNode front; // Points to the front of the queue
    private QueueNode rear; // Points to the rear of the queue

    public SLLQueue() {
        setFront(null);
        rear = null;
    }

    public boolean isEmpty() {
        return getFront() == null;
    }

    public void enqueue(int value) {
        QueueNode newNode = new QueueNode(value);
        if (isEmpty()) {
            setFront(rear = newNode);
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return a sentinel value
        }
        int value = getFront().value;
        setFront(getFront().next);
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1; // Return a sentinel value
        }
        return getFront().value;
    }

	public QueueNode getFront() {
		return front;
	}

	public void setFront(QueueNode front) {
		this.front = front;
	}
}
