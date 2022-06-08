package UE1_TodoLinkedList;

public class TodoLinkedList {
    // *** Membervariablen ***
    // TODO
    private Node first;
    private Node last;



    // *** Get-Methoden (Set-Methoden nicht notwendig) ***

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    // *** Operationen ***

    public void appendTodoText(String todoText) {
        Node newNode = new Node(todoText, null);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }

        // andere Möglichkeit ohne Konstruktor:
        /*
        Node newNode = new Node();
        newNode.setTodoText(todoText);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
         */
    }

    public void deleteLastTodoText() {
        // TODO: Implementierung vervollständigen
        Node currentNode = new Node(null, null);
            if (first == null) {
                System.out.println("List is empty");
            } else if (first==last) {
                first = null;
                last = null;
            } else {
                currentNode = first;
                while (first.getNext() != last)
                    currentNode = currentNode.getNext();
                    currentNode.setNext(null);
                    last = currentNode;
            }
        }

    public String getTodoTextAtIndex(int index) {
        // TODO: Implementierung vervollständigen
        return null;
    }
}
