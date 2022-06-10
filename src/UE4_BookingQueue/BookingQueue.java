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
        // TODO: Implementierung vervollständigen
        return null;
    }

    public int getCount()
    {
        // TODO: Implementierung vervollständigen
        return 0;
    }
}
