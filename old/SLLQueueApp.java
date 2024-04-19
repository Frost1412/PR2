package PR2.old;

	public class SLLQueueApp {
	    public static void main(String[] args) {
	        SLLQueue queue = new SLLQueue();

	        // Enqueue some items
	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(5);
	        queue.enqueue(15);

	        // Print the queue
	        printQueue(queue);

	        // Find maximum and minimum values in the queue
	        System.out.println("Maximum value in the queue: " + findMax(queue));
	        System.out.println("Minimum value in the queue: " + findMin(queue));
	    }

	    public static void printQueue(SLLQueue q) {
	        QueueNode current = q.getFront();
	        System.out.print("Queue contents: ");
	        while (current != null) {
	            System.out.print(current.value + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public static int findMax(SLLQueue q) {
	        if (q.isEmpty()) {
	            System.out.println("Queue is empty.");
	            return Integer.MIN_VALUE;
	        }
	        int maxVal = q.peek();
	        QueueNode current = q.getFront().next;
	        while (current != null) {
	            maxVal = Math.max(maxVal, current.value);
	            current = current.next;
	        }
	        return maxVal;
	    }

	    public static int findMin(SLLQueue q) {
	        if (q.isEmpty()) {
	            System.out.println("Queue is empty.");
	            return Integer.MAX_VALUE;
	        }
	        int minVal = q.peek();
	        QueueNode current = q.getFront().next;
	        while (current != null) {
	            minVal = Math.min(minVal, current.value);
	            current = current.next;
	        }
	        return minVal;
	    }
	}
