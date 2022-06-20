package UE4_BookingQueue;

public class BookingQueue
{
    // *** Membervariablen ***
        private Node front;
        private Node rear;

    // *** Getter- und Setter-Methoden ***

    public Node getFront()
    {
        return front;
    }

    public Node getRear() {
        return rear;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    // *** Operationen ***

    public void enqueue(Booking newBooking)
    {
        Node newNode = new Node(newBooking);

        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

   public Booking dequeue() throws QueueEmptyException
    {
        if (front == null) {
            throw new QueueEmptyException();
        } else if (front == rear) {
            Booking result = front.getBooking();
            front = null;
            rear = null;
            return result;
        } else {
            Booking result = front.getBooking();
            front = front.getNext();
            return result;
        }
    }

    public int getCount()
    {
        int count = 0;
        Node currentNode = front;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.getNext();
        }
        return count;
    }
}
