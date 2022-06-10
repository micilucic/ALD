package UE2_WagonLinkedList;

public class WagonLinkedList {
    // *** Membervariablen ***
   private Node first;
   private Node last;

    // *** Methoden ***

    public Node getFirst() {
        return first;
    }


    public Node getLast() {
        // TODO
        return last;
    }


    void insertWagonAtFirstPos(String wagonId) {
         Node help = new Node();
         help.setWagonId(wagonId);

         if (first == null){
             first = help;
             last = help;
         } else {
             help.setNext(first);
             first.setPrev(help);
             first = help;
         }
    }

    void removeWagonFromLastPos() {
       Node help = new Node();

       if (first == null) {
           return;
       } else if (first == last) {
           first = null;
           last = null;
       }
       else {
          last.getPrev().setNext(null);
          last = last.getPrev();
          /*
          Mit Hilfsvariable:
          Node help = last.getPrev();
          help.setNext(null);
          last = help;
           */
       }
    }

    void printList() {
        System.out.print("* List: ");

        if (this.getFirst() == null) {
            System.out.print("<empty>");
        } else {
            Node currentNode = this.getFirst();
            while (currentNode != null) {
                System.out.print(currentNode.getWagonId() + ", ");
                currentNode = currentNode.getNext();
            }
        }

        System.out.println();
    }
}
