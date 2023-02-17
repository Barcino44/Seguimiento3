public class Circular_List {
    public static int counter = 1;
    private Node head;

    public void addNode() {
        Node node = new Node(counter++);
        if (head == null) { //Enlazo el nodo asi mismo, ya que la cabeza es nula
            head = node;
            head.setNext(head);
            head.setPrevious(head);
            node.setActual(1);
        } else {
            Node tail = head.getPrevious();//Guardo el nodo previo a la cabeza
            node.setNext(head);//Lo siguiente al nodo que voy a agregar, será la cabeza (node->head)
            head.setPrevious(node);//Lo anterior a la cabeza, sera el nodo. (node<-head)
            tail.setNext(node);//Lo siguiente a la cola será el nodo.(tail ->node)
            node.setPrevious(tail);//Lo anterior al nodo, será la cola. (tail <-node)
        }
    }

    public void print() {
        print(head);
    }

    private void print(Node current) {
        if (current == head.getPrevious()) {
            System.out.println(current.getNumberOfTurn());
            return;
        }
        System.out.println(current.getNumberOfTurn());
        print(current.getNext());
    }

    public void printActualTurn() {
        if (head == null) {
            System.out.println("No hay turnos aun");
        } else {
            printActualTurn(head);
        }
    }

    public void printActualTurn(Node node) {
        if (node.getActual() == 1) {
            System.out.println("El turno actual es " + node.getNumberOfTurn());
            return;
        }
        printActualTurn(node.getNext());
    }

    public void pasarTurno() {
        if(head==null) {
            System.out.println("No has añadido ningun nodo");
        }
        else{
            pasarTurno(head);
        }
    }

    private void pasarTurno(Node node) {
        if (node.getActual() == 1) {
            Node nextTurn = node.getNext();
            node.setPassedTimes(node.getPassedTimes() + 1);
            if(node.getPassedTimes()==3){
                seguir(nextTurn);
            }
            node.setActual(0);
            nextTurn.setActual(1);
            System.out.println("El turno actual es " + nextTurn.getNumberOfTurn());
            return;
        }
        pasarTurno(node.getNext());
    }

    public void seguir() {
        if (head == null) {
            System.out.println("Lista vacia");
        }
        else if(head==head.getNext()){//Si la lista solo tiene un elemento
            head=null;
        }else {
            seguir(head);
        }
    }
    private void seguir(Node node) {
        if (node.getActual() == 1) {
            if (node == head) {
                Node prev = head.getPrevious();
                Node next = head.getNext();
                next.setPrevious(prev);
                prev.setNext(next);
                head = next;
                next.setActual(1);
            } else {
                Node prev = node.getPrevious();
                Node next = node.getNext();
                next.setPrevious(prev);
                prev.setNext(next);
                next.setActual(1);
            }
            return;
        }
        seguir(node.getNext());
    }
}

