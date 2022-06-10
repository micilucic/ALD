package UE3_BookStack;

public class BookStack
{
    // *** Membervariablen ***
        private Node top;

    // *** Getter- und Setter-Methoden ***

    public Node getTop()
    {
        return this.top;
    }


    // *** Operationen ***

    public void push(String bookTitle)
    {
        Node newNode = new Node(bookTitle);

        //Einfacher Code

        newNode.setNext(top);
        top = newNode;

     /* Komplizierter Code

       if (top == null) {
           top = newNode;
       } else {
           newNode.setNext(top);
           top = newNode;

       } */
    }

    public String pop() throws StackEmptyException
    {
        if (top == null) {
            throw new StackEmptyException();
        } else {
            String returnString = top.getBookTitle();
            top = top.getNext();
            return returnString;
        }
    }

    public int getCount()
    {
        // TODO: Implementierung
        return 0;
    }
}
